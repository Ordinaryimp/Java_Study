package com.three;

/**
 * ClassName:Exer01
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 20:35
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        Exer01 exer =new Exer01();
        exer.method1();
        System.out.println("面积为："+exer.method2());
        System.out.println("m*n面积为："+exer.method3(5,6));
    }

    public void method1 (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int method2 (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method3 (int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }
}
