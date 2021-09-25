package com.alvinmuniz.processing.sorting;

public class Rectangle {

    int x;
    int y;
    int color;
    int height;
    int width;

    public Rectangle(int x, int y,   int width, int height, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void draw() {
        BinarySort_Rectangle.processing.fill(255,200,200);

        BinarySort_Rectangle.processing.rect(this.x,this.y,this.width, this.height);

    }

    public void settings() {

    }
    public void setup() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }




}
