package com.abstracttest;

/**
 * ClassName:Vehicle
 * Package:com.abstracttest
 * Description:
 *魔板方法的设计模式
 * @Author mzy
 * @Create 2024/11/23 12:12
 * @Version 1.0
 */
public class TempleTest {
    public static void main(String[] args) {
        PrintPrimeNumber p1 = new PrintPrimeNumber();
        p1.spendTime();
    }
}
abstract class Temple{
    //计算某段代码的执行需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();//所记录时间执行代码
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start));
    }
    public abstract void code();
}

class PrintPrimeNumber extends Temple{

    @Override
    public void code() {
        for(int i = 2;i<=100000;i++){
            boolean isFlag = true;
            for(int j =2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }

        }
    }
}
