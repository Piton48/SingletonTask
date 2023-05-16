package ru.netology;

import java.util.Date;

public class Logger {

    private static Logger instanse = null;
    private int counter = 0;

    public static Logger get() {
        if (instanse == null) instanse = new Logger();
        return instanse;
    }

    public void log(String str) {
        Date date = new Date();
        System.out.println("[" + date.toString() + " " + ++counter + "] " + str);
    }

}