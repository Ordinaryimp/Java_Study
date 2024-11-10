package com.nine;

/**
 * ClassName:CylinderTest
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 14:23
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5.0);
        cylinder.setLength(10.0);
        System.out.println("圆柱底面积为："+cylinder.findArea());
        System.out.println("圆柱体积为："+cylinder.findVolume());
    }
}
