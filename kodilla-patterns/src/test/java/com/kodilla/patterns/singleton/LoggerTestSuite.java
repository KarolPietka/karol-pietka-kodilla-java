package com.kodilla.patterns.singleton;

import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog(){
        //Given
        Logger.getInstance().log("Karol");
        Logger.getInstance().log("Magda");
        Logger.getInstance().log("Tomasz");

        //When
        String lastLoggedIn = Logger.getInstance().getLastLog();

        //Than
        System.out.println("Last logged in: " + lastLoggedIn);
    }
}
