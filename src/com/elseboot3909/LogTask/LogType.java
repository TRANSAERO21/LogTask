package com.elseboot3909.LogTask;

import java.util.Random;

public enum LogType {
    VERBOSE, // Type1
    WARNING, // Type2
    ERROR; // Type3

    static Random random = new Random();

    public static Integer toInteger(LogType logType) {
        switch(logType) {
            case VERBOSE:
                return 1;
            case WARNING:
                return 2;
            case ERROR:
                return 3;
            default:
                return -1;
        }
    }

    public static LogType generateRandom() {
        return values()[random.nextInt(values().length)];
    }

}
