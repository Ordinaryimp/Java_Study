package com.one;

import java.util.Scanner;

/**
 * ClassName:ArrExer
 * Package:com.one
 * Description:
 *
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday" ,"Wednesday","Thursday","Friday","Saturday", "Sunday"}
 *
 * @Author mzy
 * @Create 2024/11/2 16:51
 * @Version 1.0
 */
public class ArrExer {
    public static void main(String[] args) {
        String[] weeks = {"Monday","Tuesday" ,"Wednesday","Thursday","Friday","Saturday", "Sunday",};

        //从键盘获取指定数值
        System.out.println("请输入1-7的数字：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<=0 || num>7){
            System.out.println("输入有误，请重新输入");
        }
        else {
            System.out.println(weeks[num - 1]);
        }
        scanner.close();

        }
}
