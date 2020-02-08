package main.java.part_01.chap_07_caseStudy;

import java.io.*;

public class Personal /*extends IOmethods*/ implements DbObject {

    protected String SSN, name, city;
    protected final int nameLen = 10, cityLen = 10, size = 9 * 2 + nameLen * 2 + cityLen * 2 + 4 + 8;
    protected int year;
    protected long salary;

    Personal() {
    }

    Personal(String ssn, String n, String c, int y, long s) {
        SSN = ssn;
        name = n;
        city = c;
        year = y;
        salary = s;
    }

    public int size() {
        return size;
    }

    public boolean equals(Object pr) {
        return SSN.equals(((Personal) pr).SSN);
    }

    public void writeToFile(RandomAccessFile out) throws IOException {
        // writeUTF instead ? also what java.io version is this? (books 1.ed 2005)
//        writeString(SSN, out);     
//        writeString(name, out);
//        writeString(city, out);
        out.writeInt(year);
        out.writeLong(salary);
    }

    public void writeLegibly() {
        System.out.print("SSN = " + SSN +
                ", name = " + name.trim() +
                ", city = " + city.trim() +
                ", year = " + year +
                ", salary = " + salary
        );
    }

    public void readFromFile(RandomAccessFile in) throws IOException {
        // accordingly: readUTF instead ?
//        SSN = readString(9, in);
//        name = readString(nameLen, in);
//        city = readString(cityLen, in);
        year = in.readInt();
        salary = in.readLong();
    }

    public void readKey() throws IOException {
        System.out.print("Enter SSN: ");
//        SSN = readLine();
    }

    public void readFromConsole() throws IOException {
        System.out.print("Enter SSN: ");
//        SSN = readLine();

        System.out.print("Name: ");
//        name = reaLine();
        for (int i = name.length(); i < nameLen; i++)
            name += ' ';

        System.out.print("City: ");
//        city = readLine();
        for (int j = city.length(); j < cityLen; j++)
            city += ' ';

        System.out.print("Birthyear: ");
//        year = Integer.valueOf(readLine().trim()).intValue();

        System.out.print("Salary: ");
//        salary = Long.valueOf(readLine().trim()).longValue();
    }

    public void copy(DbObject[] d) {
        d[0]= new Personal(SSN, name, city, year, salary);
    }
}
