package com.three;

/**
 * ClassName:ObjectArray
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 22:38
 * @Version 1.0
 */
public class StudentTest {
    //何为对象数组？如何理解？
    //数组的元素可以是基本数据类型，也可以是引用数据类型.当元素是引用类型中的类时，我们称为对象数组.

    //1)定义类学生，包含三个属性:学号编号(INT)，年级状态(INT)，成绩分数(INT)。
    //2)创建20个学生对象，学号为1到20，年级和成绩都由随机数确定.
    public static void main(String[] args) {
        //创建Student对象数组 students
        Student [] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i+1;
            students[i].state = (int)(Math.random()*6)+1;    //[1,6]
            students[i].score = (int)(Math.random()*100)+1;  //[0,100]
        }
        //打印六年级学生信息
        StudentUtil studentUtil = new StudentUtil();
        studentUtil.printGrade(students,6);
//        System.out.println("六年级学生信息:");
//        for (int i = 0; i < students.length; i++){
//            if(students[i].state == 6){
//                students[i].studentPrint();
////                Student stu = students[i];
////                System.out.println("编号："+stu.number+"\t"+"年级："+stu.state+"\t"+"成绩："+stu.score);
////                System.out.print("编号："+students[i].number+"\t");
////                System.out.println("成绩："+students[i].score);
//            }
//        }
        //冒牌排序将学生按成绩高低排序

        //排序前
        System.out.println("排序前:");
        studentUtil.printStudent(students);
//        for (int i = 0; i < students.length; i++) {
//            students[i].studentPrint();
//        }
        studentUtil.sortStudent(students);
//        for (int i = 0; i < students.length; i++) {
//            for (int j = 0; j < students.length-i-1; j++) {
//                if(students[j].score>students[j+1].score){
//                    Student temp = students[j];;
//                    students[j] = students[j+1];
//                    students[j+1]  = temp;
//                }
//            }
//        }
        System.out.println("按成绩从低到高排序后:");
        studentUtil.printStudent(students);
//        for (int i = 0; i < students.length; i++) {
//            students[i].studentPrint();
//        }
    }
}
