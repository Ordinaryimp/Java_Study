package com.five;

/**
 * ClassName:Constructor
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 17:04
 * @Version 1.0
 */
public class Student{
    public static void main(String[] args) {

    }
    String name;
    int age;
    String school;
    String major;
    public Student(String n,int a){
        name = n;
        age = a;
    }
    public Student(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }
    public Student(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
    public String getInfo(){
        return "姓名："+name+"\n年龄："+age+"\n学校："+school+"\n专业："+major;
    }

}
