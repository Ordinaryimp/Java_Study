package com.three;

/**
 * ClassName:StudentUtil
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 23:36
 * @Version 1.0
 */
public class StudentUtil {
    //对学生数组进行赋值
//    public void initStudent(Student[] students) {
//        for (int i = 0; i < students.length; i++) {
//            students[i] = new Student();
//            students[i].number = i+1;
//            students[i].state = (int)(Math.random()*6)+1;    //[1,6]
//            students[i].score = (int)(Math.random()*100)+1;  //[0,100]
//        }
//    }
    //打印指定年级信息
    public void printGrade(Student[] students, int grade) {
        System.out.println(grade + "年级学生信息:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == grade) {
                students[i].studentPrint();
            }
        }
    }
    //遍历指定学生数组
    public void printStudent(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].studentPrint();
        }
    }
    //对指定学生数组进行冒泡排序
    public void sortStudent(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length-i-1; j++) {
                if(students[j].score>students[j+1].score){
                    Student temp = students[j];;
                    students[j] = students[j+1];
                    students[j+1]  = temp;
                }
            }
        }
    }
}
