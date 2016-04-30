package asu.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import asu.parser.DemoLexer;
import asu.parser.DemoParser;

public class Main {

    private static String intermediateFileName="";

    public static void main(String args[]) throws Exception {
    	String fileName = args[0];
    	intermediateFileName = fileName.replace(".demo", ".sas");
        ANTLRInputStream inputStream = new ANTLRFileStream(fileName);
        DemoLexer lexer = new DemoLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DemoParser parser = new DemoParser(tokenStream);

        ParseTree tree = parser.program();
        MyVisitor v = new MyVisitor();
        v.visit(tree);
        String output="";
        for(String t : v.statements){
            output += t + "\n";
        }
        write(output);
    }

    private static void write(String output) throws IOException {
        File file = new File(intermediateFileName);
        if(!file.exists()){
        	file.createNewFile();
        }
        else{
        	file.delete();
        	file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        fw.write(output);
        fw.close();
    }
}
