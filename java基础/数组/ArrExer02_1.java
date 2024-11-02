package com.one;

import java.util.Scanner;

/**
 * ClassName:ArrExer02_1
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 17:38
 * @Version 2.0
 */
public class ArrExer02_1 {
    public static void main(String[] args) {
        //确认学生数量
        System.out.println("请输入学生数量：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] score = new int[number];
        int max = score[0];
        //根据提示依次输入学生成绩 获取学生成绩最高分
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            score[i] = scanner.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("学生成绩最高分是：" + max);
        //遍历数组更具成绩与最高分的差值。得到每个学生的等级

        for (int i = 0; i < score.length; i++) {
            char garde = 0;
            if ( max - score[i] <= 10) {
                garde = 'A';
            }
            else if (max - score[i] <= 20) {
                garde = 'B';
            }
            else if (max - score[i] <= 30) {
                garde = 'C';
            }
            else {
                garde = 'D';
            }
            System.out.println("第" + (i + 1) + "个学生的成绩是：" + score[i]+" "+"grade is "+garde);

        }
        scanner.close();

    }
}
