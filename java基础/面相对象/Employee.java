package com.five;

/**
 * ClassName:Employee
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 14:08
 * @Version 1.0
 */
public class Employee {
    private String name;
    private int age;
    private char gender;
    private String tel;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char g){
        gender=g;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String t){
        tel=t;
    }
    public String showInfo(){
        return name+"\t"+age+"\t"+gender+"\t"+tel;
//        return getName()+"\n"+getAge()+"\n"+getGender()+"\n"+getTel();   调方法多一次栈帧的入栈操作
    }
}
