package com.lex;

import java.math.BigDecimal;

public class Calculator extends CalculatingDevice{
    public Calculator(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        BigDecimal bigX = BigDecimal.valueOf(x);
        BigDecimal bigY = BigDecimal.valueOf(y);

        return super.calculate(x, y) + "; "
        + x + " - " + y + " = " + bigX.subtract(bigY).doubleValue() + "; ";
    }
}
