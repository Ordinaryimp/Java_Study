package com.nine;

/**
 * ClassName:Cylinder
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 14:13
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder(){
        this.length = 1.0;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return this.findArea()*getLength();
    }
}
