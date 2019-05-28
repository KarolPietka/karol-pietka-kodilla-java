package com.kodilla;

import java.util.*;

class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;

    }

    public String toString() {
        return hours + ":" + minutes;
    }

    public void time(int minutes) {
        minutes = minutes + 1;

        if (hours >= 0 && minutes < 24) {
        } else {
            hours = 0;
        }
        if (minutes >= 0 && minutes < 60) {
            minutes++;
        } else {
            minutes = 0;
        }

    }

    }


class Program {

    public static void main (String[] args) {

        Clock time1 = new Clock(20,15);
        Clock time2 = new Clock(20, 20);
        Clock time3 = new Clock(20, 25);

        List<Clock> clockList = new LinkedList<>();
        clockList.add(time1);
        clockList.add(time2);
        clockList.add(time3);

        for(Clock times : clockList){
            times.time(10);

            System.out.println(times);
        }
        /*for(Clock times : clockList){
            times.time(10);
            times.time(20);
            times.time(30);
            times.time(10);
            times.time(20);
            times.time(30);
            times.time(40);
            times.time(10);
            times.time(10);
            times.time(10);
            System.out.println(clockList);
        }*/
    }
}