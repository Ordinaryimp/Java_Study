package com.ten;

/**
 * ClassName:GeometricObject
 * Package:com.ten
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/11 15:46
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight){

    }

    public double findArea(){
        return 0.0;
    }
}
