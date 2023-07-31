package com.workintech.model;

public class Cylinder extends Circle {
    double height;

    private void checkHeight (double height) {
        if(height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public Cylinder(double radius, double height) {
        super(radius);
        checkHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}
