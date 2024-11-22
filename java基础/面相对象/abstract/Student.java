package com.sixteen;

/**
 * ClassName:Student
 * Package:com.sixteen
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/22 9:05
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name,int age,String school){
        super(name,age);
    }
    public void eat(){
        System.out.println("学生多吃饭");

    }
    public void sleep(){
        System.out.println("学生保持充足睡眠");
    }
}
