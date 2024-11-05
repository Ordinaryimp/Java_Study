package com.five;

/**
 * ClassName:Recursion
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 22:34
 * @Version 1.0
 */
public class Recursion {
    public static void main(String[] args) {
        //递归调用会占用大量的系统堆栈，内存耗用多，在递归调用层次多时速度要比循环慢的多，所以在使
        //递归时要慎重.
        //在要求高性能的情况下尽量避免使用递归，递归调用既花时间又耗内存.考虑使用循环迭代
        Recursion test = new Recursion();
        System.out.println(test.getSum(100));
        System.out.println(test.getFactorial(10));
        System.out.println(test.getFibonacci(10));
    }
    //斐波那契数列
    public int getFibonacci(int n){
        if(n==1){
            return 1;
        } else if (n==2) {
            return 1;
        }else{
            return getFibonacci(n-1)+getFibonacci(n-2);
        }
    }
    //计算1-100内自然数总和：
    public int getSum(int n){
        if (n==1){
            return 1;
        }
        return n+getSum(n-1);
    }
    //计算n的阶乘：
    public int getFactorial(int n){
        if (n==1){
            return 1;
        }
        return n*getFactorial(n-1);
    }

}
