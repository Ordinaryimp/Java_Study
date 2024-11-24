package com.interfacetest;

/**
 * ClassName:InterfaceTest
 * Package:com.interfacetest
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/23 13:43
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);

        System.out.println(Flyable.MAX_SPEED);

        Bullet b1 = new Bullet();
        b1.fly();
        b1.attack();
        // Flyable.MAX_SPEED = 10000;  //无法将值赋给 final 变量 'MAX_SPEED'

        Flyable f1 = new Bullet();
        f1.fly();
    }
}

interface Flyable{//接口
    //全局常量
    public static final int MIN_SPEED = 0;
    //删了依然有 public static final
    int MAX_SPEED = 7900;

    //抽象方法
//    public abstract void fly();
    void fly();    //省略了 public abstract
}
interface Attackable{//接口
    public abstract void attack();
}

abstract class Plane implements Flyable{

}

class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {
        System.out.println("让子弹飞一会");
    }

    @Override
    public void attack() {
        System.out.println("鸡哔你~");
    }
}
//测试接口继承关系
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{//接口可以多继承

}

class DD implements CC{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

