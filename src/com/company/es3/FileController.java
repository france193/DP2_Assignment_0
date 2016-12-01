package com.company.es3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FLDeviOS on 17/10/2016.
 */
public class FileController {

    private List<File> lines;

    public List<File> importLinesFromFile(String filename) throws FileNotFoundException, IOException {

        lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while( (line = br.readLine()) !=null ) {
                lines.add(new File(line));
            }
        }

        return lines;
    }

    @Override
    public String toString() {
        return "FileController{" +
                "lines=" + lines +
                '}';
    }

    public void writeFile(List<File> file3, String s) throws IOException {

        FileWriter writer = new FileWriter(s);

        for(File str: file3) {
            writer.write(str.getLine()+"\n");
        }

        writer.close();
    }
}
