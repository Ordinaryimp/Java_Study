package com.equals;

import java.io.File;
import java.util.Objects;

/**
 * ClassName:UserTest
 * Package:com.eleven
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/12 16:07
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Tom",18);
        User u2 = new User("Tom",18);

        System.out.println(u1.equals(u2));//false->true

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        File file1 = new File("hello.txt");
        File file2 = new File("hello.txt");
        System.out.println(file1.equals(file2));//true

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);//true 原因是  s1 和 s2 是同一个对象，在常量池中
    }

}

class User{
    String name;
    int age;
  public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    @Override
//    //重写equals方法()
//    public boolean equals(Object obj){
//        if(this==obj){
//            return true;
//        }
//
//        if(obj instanceof User){
//            User user = (User)obj;
////            if(this.age==user.age && this.name.equals(user.name)){
////                return true;
////            }else{
////                return false;
////            }
//            return this.age==user.age && this.name.equals(user.name);
//        }
//
//        return false;
//    }
    //IDEA自动实现的重写equals方法


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
}
