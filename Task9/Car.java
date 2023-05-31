package com.lex;

import java.util.Random;

public class Car {
    private int fuel;
    private int km;
    private final Random r = new Random();
    public Car(){
        this.fuel = this.r.nextInt(36);
        this.km = this.r.nextInt(36);
    }

    public void fill(){
        if(this.r.nextInt(10) == 0){
            throw new Explosion("Duck!");
        } else {
            this.fuel += this.r.nextInt(15, 36);
            System.err.println("You got lucky. Current fuel level: " + this.fuel);
        }
    }

    public void drive100km() throws NotEnoughGas{
        if(this.fuel < 10){
            throw new NotEnoughGas("Oops! You're out of fuel.");
        } else {
            this.fuel -= 10;
            this.km += 100;
            System.err.println("Current fuel level: " + this.fuel + ". You've travelled " + this.km + "km so far.");
        }
    }
}
