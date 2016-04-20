package edu.ase.se.sas.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.FileReadException;
import edu.ase.se.sas.exceptions.RuntimeException;

public class Loader {

	private String fileName;

	public int mStartNo;
	public int mEndNo;
	private boolean funcVar = false;

	public Loader(String fileName) throws FileReadException {
		this.fileName = fileName;
		readFile();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

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
					mEndNo = lineNo;
					break;
				default:
					String opCode = line.split(" +")[0];
					switch (opCode) {
					case "STORE":
						if (!funcVar) {
							String param = line.split(" +")[1];
							String var = param.split(",")[0].trim();
							String value = param.split(",")[1].trim();
							Object val;
							try {
								val = NativeMethodExecutor.getParsedValue(value);
							} catch (RuntimeException e) {
								throw new FileReadException("Unable to read the value " + value, e);
							}
							Runtime.globalVarMap.put(var, val);
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
