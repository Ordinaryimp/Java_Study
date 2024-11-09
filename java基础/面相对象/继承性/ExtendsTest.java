package com.eight;

/**
 * ClassName:ExtendsTest
 * Package:com.eight
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/9 15:32
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "qwp";
        p1.eat();
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "qwq";
        s1.school = "cqupt";
        s1.eat();
        //获取s1、p1所属类的父类
        System.out.println(s1.getClass().getSuperclass());  //class com.eight.Person
        System.out.println(p1.getClass().getSuperclass());  //class java.lang.Object        默认继承Object类
    }
}
