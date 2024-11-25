package com.interfacetest;

/**
 * ClassName:SubTest
 * Package:com.interfacetest
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/25 15:27
 * @Version 1.0
 */
public class SubTest {
    public static void main(String[] args) {
        //接口中声明的静态方法只能由接口调
        CompareA.method1();
        //      SubClass.method1();
        SubClass s1 = new SubClass();
        s1.method2();
        //知识点3：类实现了两个接口，而两个接口中定义了同名同参数的默认方法。则实现类在没有重写此两个接口
        //默认方法的情况下，会报错。->接口冲突
        //要求:此时实现类必须要重写接口中定义的同名同参数的方法
        s1.method3();
        //知识点4：子类(或实现类)继承了父类并实现了接口.父类和接口中声明了同名同参数的方法.(其中，接口中的方法)
        //是默认方法)。默认情况下，子类(或实现类)在没有重写此方法的情况下，调用的是父类中的方法.->类优先原则
        s1.method4();
    }

}
