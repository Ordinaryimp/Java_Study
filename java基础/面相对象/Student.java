package com.three;

/**
 * ClassName:Student
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 22:39
 * @Version 1.0
 */
public class Student {
    int number;
    int state;
    int score;
    //声明一个方法打印学生信息
    public void studentPrint(){
        System.out.println("学号："+number+"\t"+"年级："+state+"\t"+"成绩："+score);
    }
}
