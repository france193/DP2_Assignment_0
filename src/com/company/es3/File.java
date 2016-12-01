package com.company.es3;

/**
 * Created by FLDeviOS on 17/10/2016.
 */
public class File implements Comparable<File> {

    private String line;

    public File(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    @Override
    public int compareTo(File o) {
        return this.line.compareTo(o.getLine());
    }

    @Override
    public String toString() {
        return "File{" +
                "line='" + line + '\'' +
                '}';
    }
}
