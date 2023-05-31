package com.lex;

public class NotEnoughGas extends Exception{
    public NotEnoughGas(String errorMessage){
        super(errorMessage);
    }
}
