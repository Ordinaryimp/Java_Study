package com.toString;

import java.io.File;
import java.sql.Date;

/**
 * ClassName:ToString
 * Package:com.toString
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/13 15:01
 * @Version 1.0
 */
public class ToString {
    public static void main(String[] args){
        User u1 = new User("Tom",12);
        System.out.println(u1.toString());  //com.toString.User@3b07d329
        System.out.println(u1);//com.toString.User@3b07d329

        String s1 = new String("hello");
        System.out.println(s1.toString());

        File file = new File("hello.txt");
        System.out.println(file.toString());

        Date date = new Date(21423);
        System.out.println(date.toString());
    }
    /**
     * public String toString() {
     *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
     *     }
     */

}
class User{
    String name;
    int age;
    public User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    @Override
//    //手动实现toString方法
//    public String toString(){
//        return "User{ name = " + name + ", age = " + age + "}";
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
