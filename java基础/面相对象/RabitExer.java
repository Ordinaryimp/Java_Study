package com.five;

/**
 * ClassName:RabitExer
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 23:24
 * @Version 1.0
 */
public class RabitExer {
    public static void main(String[] args) {
        RabitExer rabitExer = new RabitExer();
        int month = 24;
        System.out.println("兔子对数为："+rabitExer.getRabitExerNum(month));

    }
    public int getRabitExerNum(int month) {
        if(month==1){
            return 1;
        }else if(month==2){
            return 1;
        }else{
            return getRabitExerNum(month-1)+getRabitExerNum(month-2);
        }
    }
}
