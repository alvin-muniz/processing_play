package com.alvinmuniz.processing.sorting;
import processing.core.PApplet;

import java.util.ArrayList;

public class BinarySort extends PApplet{

    @Override
    public void setup() {
    }

    @Override
    public void settings() {
        size(500, 500);
    }


    @Override
    public void draw(){
        int startingX1 = 50;
        int endingPointX2 = 400;
        int startingHeightY1 = 250, endingHeightY2 = 250;
        line(startingX1, startingHeightY1, endingPointX2, endingHeightY2);
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i < 200; i++) {
            int height = (int)(Math.random() * 100);
            array.add(height);
            int y = startingHeightY1 - array.get(i);
            int width = 2;
            int x = startingX1;
            if( i == 0)
                rect(x , y, width, height);
            else
                rect(x + (2 * i), y, width, height);
        }


        noLoop();
    }
    static public void main(String args[]) {

        PApplet.main("com.alvinmuniz.processing.sorting.BinarySort", args);

    }



}
