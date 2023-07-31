package com.workintech.model;

public class Rectangle {
    double width;
    double length;

    private void checkWidth(double width) {
        if(width < 0) {
           this.width =0;
        }else {
           this.width = width;
        }
    }
    private void checkLength(double length) {
        if(length < 0) {
            this.length =0;
        }else {
            this.length = length;
        }
    }
    public Rectangle(double width,double length) {
        checkWidth(width);
        checkLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea() {
        return this.width * this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
