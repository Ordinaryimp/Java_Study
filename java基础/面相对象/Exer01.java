package com.four;

import java.io.PrintStream;

/**
 * ClassName:Exer01
 * Package:com.four
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 20:28
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args){
        int a=10;
        int b=10;
        method(a,b);    //仅打印 a=100 b=200
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void method(int a,int b){
        a=100;
        b=200;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.exit(0);
    }
    public static void method2(int a,int b){
        PrintStream ps = new PrintStream(System.out){
            @Override
            public void println(String x) {
                if("a=10".equals(x)){
                    x="a=100";
                }else if("b=10".equals(x)){
                    x="b=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}
