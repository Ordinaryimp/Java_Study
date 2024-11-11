package com.ten;

/**
 * ClassName:Circle
 * Package:com.ten
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/11 15:55
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle(String color,double weight,double radius){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double findArea(){
        return radius*radius*3.14;
    }
}
