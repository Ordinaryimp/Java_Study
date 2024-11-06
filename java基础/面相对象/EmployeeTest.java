package com.five;

import java.util.Scanner;

/**
 * ClassName:EmployeeTest
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 14:18
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建employee[]
        Employee[] emps = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < emps.length; i++){
            emps[i] = new Employee();
            System.out.println("------添加第"+(i+1)+"个员工信息------");
            System.out.print("姓名: ");

            emps[i].setName(scanner.next());
            System.out.print("性别: ");
            emps[i].setGender(scanner.next().charAt(0));    //没有nextChar()方法
            System.out.print("年龄: ");
            emps[i].setAge(scanner.nextInt());
            System.out.print("电话: ");
            emps[i].setTel(scanner.next());
        }
        scanner.close();
        //遍历员工列表
        System.out.println("------------员工列表-------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t");
        for (int i = 0; i < emps.length; i++){
            System.out.println((i+1)+"\t"+emps[i].showInfo());
        }
        System.out.println("-----------员工列表完成-----------");
    }
}
