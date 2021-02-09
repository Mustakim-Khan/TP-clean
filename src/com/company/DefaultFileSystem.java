package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DefaultFileSystem implements IFileSysytem {
    @Override
    public String ReadTextFile(String path) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
