package com.one;

import java.util.Scanner;

/**
 * ClassName:ArrExer02
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 17:13
 * @Version 1.0
 */
public class ArrExer02 {
    public static void main(String[] args) {
        //确认学生数量
        System.out.println("请输入学生数量：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] score = new int[number];
        //根据提示依次输入学生成绩
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            score[i] = scanner.nextInt();
        }
        //获取学生成绩最高分
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("学生成绩最高分是：" + max);
        //遍历数组更具成绩与最高分的差值。得到每个学生的等级
        for (int i = 0; i < score.length; i++) {
            int grade = 0;
            if ( max - score[i] <= 10) {
                System.out.println("第" + (i + 1) + "个学生的成绩是：" + score[i]+" "+"grade is A");
            }
            else if (max - score[i] <= 20) {
                System.out.println("第" + (i + 1) + "个学生的成绩是：" + score[i]+" "+"grade is B");
            }
            else if (max - score[i] <= 30) {
                System.out.println("第" + (i + 1) + "个学生的成绩是：" + score[i]+" "+"grade is C");
            }
            else {
                System.out.println("第" + (i + 1) + "个学生的成绩是：" + score[i]+" "+"grade is D");
            }

        }
        scanner.close();

    }
}
