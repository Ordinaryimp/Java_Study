package com.five;

/**
 * ClassName:RecursionTest
 * Package:com.five
 * Description:
 *
 *  总结：递归朝着已知值移动，最终达到已知值，从而求解未知值。
 *
 * @Author mzy
 * @Create 2024/11/5 23:02
 * @Version 1.0
 */
public class RecursionTest {
    //练习1：
    //已知一个数列：f(20)=1，f(21)=4，f(n+2)=2*f(n+1)+f(n)
    //其中n是大于0的整数，求f(5)的值.
    public static void main(String[] args) {
        RecursionTest recursion = new RecursionTest();
        System.out.println(recursion.getF(5));
        System.out.println(recursion.func(10));
    }
    public int getF(int n){
        if(n==20){
            return 1;
        }else if(n==21){
            return 4;
        }else{
            return getF(n+2)-2*getF(n+1);
            //通过换元得到 朝着未知值方向走，错误
//            return getF(n-1)-2*getF(n-3);
        }
    }
    //练习2：
    //已知有一个数列：f(0)=1，f(1)=4，
    //F(n+2)=2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值
    public int func(int n){
        if(n==0){
            return 1;
        } else if (n==1) {
            return 4;
        }else {
            return 2*func(n-1)+func(n-2);
        }
    }
}
