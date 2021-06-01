package com.foxmula.assignment1;
import java.util.Scanner;
public class Time {
    private int hour, min, sec;
    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    Time add(Time tobj) {
        Time time = new Time();
        time.sec = this.sec + tobj.sec;  

        if(time.sec >= 60) {    
            time.min += 1;
            time.sec -= 60;
        }

        time.min += this.min + tobj.min;
        if(time.min >=60) {     
            time.hour += 1;
            time.min -= 60;
        }

        time.hour += this.hour + tobj.hour;
        if(time.hour > 24) {    
            time.hour -= 24;
        }

        return time;
    }
    void display(String str) {
        System.out.println(str + "" +hour + ":" +min + ":" +sec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time: ");

        Time tobj = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Time tobj2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Time tobj3 = tobj.add(tobj2);

        tobj.display("Time A: ");
        tobj2.display("Time B: ");
        tobj3.display("After addition the final result will be: ");
    }
}