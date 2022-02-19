package com.alvinmuniz.processing.sorting;
import processing.core.PApplet;


public class BinarySort extends PApplet{

    // GIVEN
    // A NUMBER OF NUMBERS
    int numberOfNumbers = 200;
    // A storage container for those numbers
    int[] values = new int[numberOfNumbers];
    // the starting position of the x axis?
    int deltaX = 1;
    // the step in the line
    int step = 0;


    @Override
    public void setup() {

        // width / number of numbers 1000/200 = 5
        // tracks the change in X
        deltaX = width/numberOfNumbers;

        // populating the values array with a set of random numbers.
        for(int i = 0; i < values.length; i++) {
            int randomValue = (int)(Math.random() * height);
            values[i] = randomValue;

        }
    }

    @Override
    public void settings() {
        size(1000, 500);
    }


    @Override
    public void draw(){
        background(255);
        stroke(180);

        // check to see if the current step is before the total number of
        // steps that can be taken.
        // if not, the take another selectionSortStep
        // if, then don't
        if(step < numberOfNumbers) {
            // increments step
            selectionSortStep();
        }

        // starting at point zero we check I against the total number of
        // values in the values array
        for(int i = 0; i < values.length; i++) {
            // color codes up until the current index otherwise, it'll fill
            // it in a different color
            if(i < step) {
                fill(values[i], 255, numberOfNumbers);
            } else {
                fill(values[i], 255, numberOfNumbers, 150);
            }

            // draws the rectangle ->
            // rect(x coordinate, y coordinate, width, height)
            rect(i * deltaX, height-values[i], deltaX, values[i]);
        }

        // continues on the looping through the results!
        // terminator for the drawing process!
        if(step == numberOfNumbers) {
            noLoop();
        }

    }

    private void selectionSortStep() {
        // we are coming at it from the point that the current step is the
        // smaller value
        int smallSpot = step;

        // iterate, starting from the current step and then going until the
        // current step is greater than or equal to values.length
        for(int j = step; j < values.length; j++) {
            // if the current value is greater than the index
            if(values[smallSpot] > values[j]) {
                // swap the small spot
                smallSpot = j;
            }
        }

        //
        swap(values, smallSpot, step);
        step++;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static public void main(String args[]) {
        PApplet.main("com.alvinmuniz.processing.sorting.BinarySort", args);
    }



}
