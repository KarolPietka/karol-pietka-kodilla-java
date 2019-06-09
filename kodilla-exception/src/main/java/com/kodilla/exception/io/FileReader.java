package com.kodilla.exception.io;


import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class FileReader {


    public void readFile(){

        File file = new File("D:\\Programowanie\\Projects\\kodilla-course\\kodilla-exception\\src\\main\\resources\\file\\names.txt");//classLoader.getResource("/file/names.txt").getFile());

        Path path = Paths.get(file.getPath());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){

            fileLines.forEach(System.out::println);

        } catch (IOException e){

            System.out.println("Oh now! Something is wrong! Error: " + e);

        } finally{

            System.out.println("I am gonna be here... always!");
        }
    }
}
