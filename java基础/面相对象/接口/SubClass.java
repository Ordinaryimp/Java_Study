package com.interfacetest;

/**
 * ClassName:SubClass
 * Package:com.interfacetest
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/25 14:59
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA, CompareB{
    public void method2() {
        System.out.println("SubClass 上海");
    }
    public void method3() {
        System.out.println("SubClass 广州");
    }
    public void method4(){
        System.out.println("SubClass 深圳");
    }
    public void method(){
        //知识点5如何在子类(或实现类)中调用父类或接口中被重写的方法

        method4();//调用自己类中方法
        super.method4();//调用父类的方法
        method3();//调用自己类中的方法
        CompareA.super.method3();//调用接口A中的方法
        CompareB.super.method3();//调用接口B中的方法
    }
}
