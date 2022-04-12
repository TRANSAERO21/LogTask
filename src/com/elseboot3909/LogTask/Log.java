package com.elseboot3909.LogTask;

import java.util.Comparator;

public class Log implements Comparator<Log> {
    public final LogType Type;
    public final Integer Count;

    public Log(LogType type, Integer count) {
        Type = type;
        Count = count;
    }

    @Override
    public int compare(Log o1, Log o2) {
        if (o1.Type == o2.Type) return o1.Count.compareTo(o2.Count);
        return LogType.toInteger(o1.Type).compareTo(LogType.toInteger(o2.Type));
    }

    @Override
    public String toString() {
        return Type.toString() + ": " + Count;
    }
}
