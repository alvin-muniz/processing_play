package com.alvinmuniz.processing.sorting;

public class Rectangle {

    int x;
    int y;
    Color color;
    int height;
    int width;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void draw() {
            BinarySort_Rectangle.processing.fill(this.color.red, this.color.green
                    , this.color.blue);
            BinarySort_Rectangle.processing.rect(this.x, this.y, this.width,
                    this.height);

    }

    public void settings() {

    }

    public void setup() {

    }

    public void shift() {
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

class Color {
    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }


}
