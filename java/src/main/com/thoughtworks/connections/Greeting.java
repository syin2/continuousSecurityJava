package com.thoughtworks.connections;

public class Greeting {
    private static long count = 0;

//    public Greeting(long count) {
//        this.count = count;
//    }

    public long getCount() {
        return ++count;
    }
}
