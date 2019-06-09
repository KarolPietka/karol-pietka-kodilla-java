package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import java.io.*;



public class ExceptionModuleRunner {
    public static void main(String[] args) {

        //8.3
       /* FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        try {
            fileReader.readFile();
        } catch (IOException e) {
            System.out.println("Oh now! Something is wrong! Error: " + e);
        }
*/
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();

        } catch (FileReaderException e) {

            System.out.println("Problem while reading file");
        }

        /*8.1
        FileReader fileReader = new FileReader();
            fileReader.readFile();
         */
    }
}
