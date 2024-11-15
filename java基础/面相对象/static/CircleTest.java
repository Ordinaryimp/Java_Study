package com.eleven;

/**
 * ClassName:CircleTest
 * Package:com.eleven
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/15 14:42
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);
        Circle c3 = new Circle();
        System.out.println(c3);
        Circle c4 = new Circle(2.9);
        System.out.println(c4);
        //System.out.println(c1.toString());

    }
}
class Circle{
    private double radius;//半径
    private int id;//编号
    static int total;//创建circle实例的个数
    private static int init = 1001;
    public Circle(){
        this.id =init++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
