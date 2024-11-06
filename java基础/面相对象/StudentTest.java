package com.five;

/**
 * ClassName:StudentTest
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 17:12
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("李白",29,"北大","心理学");
        System.out.println(s1.getInfo());
        Student s2 = new Student("杜甫",39,"清华");
        System.out.println(s2.getInfo());
    }
}
