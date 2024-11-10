package com.nine;

/**
 * ClassName:Circle
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 14:07
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double findArea(){
        return 3.14*Math.pow(getRadius(),2);
    }
}
