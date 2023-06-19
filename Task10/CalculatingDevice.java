package com.lex;

import java.util.stream.Stream;

public class CalculatingDevice {
    private String name;

    public CalculatingDevice(String name) {
        this.name = name;
    }
    public String calculate(double x, double y){
        return this.name + ": " + x + " + " + y + " = " + Double.sum(x, y);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printRes(CalculatingDevice[] a, double x, double y){
        Stream.of(a).forEach(c -> System.out.println(c.calculate(x, y)));
    }
}
