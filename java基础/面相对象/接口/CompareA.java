package com.interfacetest;

/**
 * ClassName:CompareA
 * Package:com.interfacetest
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/25 14:56
 * @Version 1.0
 */
public interface CompareA {
    //属性:声明为public static final
    //方法:jdk8之前:只能声明抽象方法

    //方法:jdk8中:静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }
    //方法:jdk8中:默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }
    //接口冲突 ：类实现了两个接口，而两个接口中定义了同名同参数的默认方法
    public default void method3(){
        System.out.println("CompareB:广州");
    }
    public default void method4(){
        System.out.println("CompareA:深圳");
    }
    //jdk9新特性:定义私有方法
    private void method5(){
        System.out.println("我是接口私有方法");
    }
}
