package com.sixteen;

/**
 * ClassName:Person
 * Package:com.sixteen
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/22 9:02
 * @Version 1.0
 */
public abstract class Person {//抽象类
    String name;
    int age;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public abstract void eat();//抽象方法
    public abstract void sleep();

}
