package com.company;

import java.util.Random;

public class Dice {

    private int numofSides;
    private int faceValue;

    public Dice(int numberOfSides) {
        numofSides = numberOfSides;

        Random kastTerning = new Random();
        faceValue = kastTerning.nextInt(numberOfSides) + 1;
    }
    public void rollDice(){
        Random kastTerning = new Random();
        faceValue = kastTerning.nextInt(numofSides) + 1;
    }
    public int getFaceValue(){
        return faceValue;
    }
}


