package com.lex;

public class Explosion extends RuntimeException{
    public Explosion(String errorMessage){
        super(errorMessage);
    }
}
