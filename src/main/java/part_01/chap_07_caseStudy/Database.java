package part_01.chap_07_caseStudy;

import java.io.*;

public class Database {

    private RandomAccessFile database;
    private String fName = new String();

    Database() throws IOException{
        System.out.print("File name: ");
    }

    private void add(DbObject d) throws IOException{
        database = new RandomAccessFile(fName, "rw");

        database.seek(database.length());
        d.writeToFile(database);
        database.close();
    }

    private void modify(DbObject d) throws IOException{
        DbObject[] tmp = new DbObject[1];

        d.copy(tmp);
        database = new RandomAccessFile(fName, "rw");

        while(database.getFilePointer()<database.length()){
            tmp[0].readFromFile(database);

            if(tmp[0].equals(d)){
                tmp[0].readFromConsole();
                database.seek(database.getFilePointer()-d.size());
                tmp[0].writeToFile(database);
                database.close();
                return;
            }
        }
        database.close();
        System.out.println("The record to be modified is not in the database");
    }

    private boolean find(DbObject d) throws IOException{
        DbObject[] tmp = new DbObject[1];

        d.copy(tmp);
        database = new RandomAccessFile(fName, "r");

        while (database.getFilePointer()<database.length()){
            tmp[0].readFromFile(database);

            if(tmp[0].equals(d)){
                database.close();
                return true;
            }
        }
        database.close();
        return false;
    }

    private void printDb(DbObject d) throws IOException{
        database = new RandomAccessFile(fName, "r");

        while (database.getFilePointer()<database.length()){
            d.readFromFile(database);
            d.writeLegibly();
            System.out.println();
        }
        database.close();
    }

    public void run(DbObject rec) throws IOException{
        String option ="";
        System.out.println("1. Add; 2. Find; 3. Modify a record; 4. Exit");
        System.out.println("Enter an option: ");
        
        while (true){
            if (option.charAt(0)=='1'){
                rec.readFromConsole();
                add(rec);
            }
            else if(option.charAt(0)=='2'){
                rec.readKey();
                System.out.println("The record is ");
                if(find(rec)==false)
                    System.out.print("not ");
                System.out.println("in the database");
            }
            else if(option.charAt(0)=='3'){
                rec.readKey();
                modify(rec);
            }
            else if(option.charAt(0)!='4')
                System.out.println("Wrong option");

            else return;
            printDb(rec);
            System.out.print("Enter an option: ");
        }
    }
}