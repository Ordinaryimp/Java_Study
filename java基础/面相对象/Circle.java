package com.four;

/**
 * ClassName:Circle
 * Package:com.four
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 17:46
 * @Version 1.0
 */
public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radious=6;
        PassObject pass = new PassObject();
        pass.printAreas(circle,5);
        System.out.println("Now radious is: "+circle.radious);
    }
    double radious;
    public double findArea(){
        return Math.PI*Math.pow(radious,2);
    }
}
