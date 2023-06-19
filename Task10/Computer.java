package com.lex;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Computer extends Calculator{
    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        BigDecimal bigX = BigDecimal.valueOf(x);
        BigDecimal bigY = BigDecimal.valueOf(y);
        double multiplication = bigX.multiply(bigY).doubleValue();
        double division = bigX.divide(bigY, 2, RoundingMode.CEILING).doubleValue();
        return super.calculate(x, y)
                + x + " * " + y + " = " + multiplication + "; "
                + x + " / " + y + " = " + division;
    }
}
