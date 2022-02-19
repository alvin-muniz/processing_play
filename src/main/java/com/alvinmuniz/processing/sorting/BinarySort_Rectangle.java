package com.alvinmuniz.processing.sorting;
import processing.core.PApplet;

import java.util.ArrayList;

public class BinarySort_Rectangle extends PApplet{

    public static PApplet processing;

    @Override
    public void setup() {
        processing = this;
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
        ArrayList<Rectangle> rectangleArray = new ArrayList<>();
        Rectangle currentSelection = null;

        for(int i = 0; i < 200; i++) {
            int height = (int)(Math.random() * 100);
            array.add(height);
            int y = startingHeightY1 - height  ;
            int width = 2;
            int x = startingX1;

            if( i == 0) {
                currentSelection = new Rectangle(x, y, width, height,
                        new Color(123,0,0));
                rectangleArray.add(currentSelection);
                rectangleArray.get(i).draw();
            }
            else {
                currentSelection = new Rectangle(x + (2 * i), y, width,
                        height, new Color(123,220,0));

                rectangleArray.add(currentSelection);

                rectangleArray.get(i).draw();

            }



        }

        noLoop();


    }
    static public void main(String args[]) { }



}
