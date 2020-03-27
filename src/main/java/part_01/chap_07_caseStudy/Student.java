package part_01.chap_07_caseStudy;

import java.io.*;
//import java.io.IOException;
//import java.io.RandomAccessFile;

public class Student extends Personal {

    protected String major;
    protected final int majorLen = 10;

    Student() {super();}

    Student(String ssn, String n, String c, int y, long s, String m) {
        super(ssn, n, c, y, s);
        major = m;
    }

    public int size() {
        return super.size() + majorLen * 2;
    }

    public void writeToFile(RandomAccessFile out) throws IOException {
        super.writeToFile(out);
    }

    public void readFromFile(RandomAccessFile in) throws IOException {
        super.readFromFile(in);
    }

    public void readFromConsole() throws IOException {
        super.readFromConsole();
        System.out.print("Enter major: ");
        for (int i = major.length(); i < nameLen; i++)
            major += ' ';
    }

    public void writeLegibly(){
        super.writeLegibly();
        System.out.print(", major = "+ major.trim());
    }

    public void copy(DbObject[] d) {
        d[0] = new Student(SSN, name, city, year, salary, major);
    }
}