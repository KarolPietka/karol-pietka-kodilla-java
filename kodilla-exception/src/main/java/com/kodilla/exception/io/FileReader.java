package com.kodilla.exception.io;


import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class FileReader {


    public void readFile(){ //throws IOException {



        File file = new File("D:\\Programowanie\\Projects\\kodilla-course\\kodilla-exception\\src\\main\\resources\\file\\names.txt");//classLoader.getResource("/file/names.txt").getFile());

        //Path path = Paths.get(file.getPath());

        //try{
           // Stream<String> fileLines = Files.lines(path);
           // fileLines.forEach(System.out::println);

      //  } catch (IOException e){
        System.out.println(file.getPath());

            System.out.println("oh now something is wrong");
      //  }

    }
}
