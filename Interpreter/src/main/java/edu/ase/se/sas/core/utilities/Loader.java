package edu.ase.se.sas.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.FileReadException;
import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * This class is used to load the intermediate code and map the line numbers to
 * the instruction as well as to the method names.
 *
 */
public class Loader {

	/**
	 * The file name of the intermediate code
	 */
	private String fileName;

	/**
	 * The line number where the main method starts.
	 */
	public int mStartNo;

	/**
	 * Indicates if the variable is a function variable or a global variable.
	 */
	private boolean funcVar = false;

	/**
	 * 
	 * @param fileName
	 *            The file name of the intermediate code.
	 * @throws FileReadException
	 *             When something goes wrong while loading the file.
	 */
	public Loader(String fileName) throws FileReadException {
		this.fileName = fileName;
		readFile();
	}

	/**
	 * {@link Loader#fileName}}
	 * 
	 * @return the file name of the intermediate code.
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * {@link Loader#fileName}}
	 * 
	 * @param fileName
	 *            the file name of the intermediate code.
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Reads the file and maps function names and instructions.
	 * 
	 * @throws FileReadException
	 *             When something goes wrong while loading the file.
	 */
	private void readFile() throws FileReadException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(fileName)));

			String line = null;
			int lineNo = 1;
			while ((line = br.readLine()) != null) {
				Runtime.instructionMap.put(lineNo, line);
				switch (line) {
				case "MSTART":
					funcVar = true;
					mStartNo = lineNo;
					break;
				case "MEND":
					funcVar = false;
					break;
				default:
					String opCode = line.split(" +")[0];
					String variable;
					switch (opCode) {
					case "STORE":
						if (!funcVar) {
							String param = line.split(" +")[1];
							String var = param.split(",")[0].trim();
							String value = param.split(",")[1].trim();
							Object val;
							try {
								val = Common.getParsedValue(value);
							} catch (RuntimeException e) {
								throw new FileReadException("Unable to read the value " + value, e);
							}
							Runtime.globalVarMap.put(var, val);
						}
						break;
					case "DCLRI":
						if (!funcVar) {
							variable = line.split(" +")[1];
							Runtime.globalVarMap.put(variable, 0);
						}
						break;
					case "DCLRB":
						if (!funcVar) {
							variable = line.split(" +")[1];
							Runtime.globalVarMap.put(variable, false);
						}
						break;
					case "DCLRS":
						if (!funcVar) {
							variable = line.split(" +")[1];
							Runtime.globalVarMap.put(variable, "");
						}
						break;
					case "FUNC":
						funcVar = true;
						String param = line.split(" +")[1];
						String funcName = param.split(",")[0].trim();
						Runtime.methodIndexMap.put(funcName, lineNo);
						break;
					case "FEND":
						funcVar = false;
						break;
					}
					break;
				}

				lineNo++;
			}

		} catch (IOException e) {
			throw new FileReadException("Error while reading the source file.", e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new FileReadException("Error while reading the source file.", e);
				}
			}
		}
	}
}
