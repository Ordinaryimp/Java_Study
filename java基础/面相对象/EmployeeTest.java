package com.three;

/**
 * ClassName:EmployeeTest
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 14:51
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建类的实例（对象）
        Employee emp1 = new Employee();
        System.out.println(emp1);   //地址值

        emp1.age=23;
        emp1.id="001";
        emp1.name="张三";
        emp1.salary=8000;
        emp1.birthday=new Mydate();
        emp1.birthday.year=2002;
        emp1.birthday.month=12;
        emp1.birthday.days=12;
//        System.out.println("编号为:"+emp1.id+" "+"姓名为:"+emp1.name+" "+"年龄为:"+emp1.age+" "+"薪资为:"+emp1.salary+" "+
//                "生日为:"+emp1.birthday.year+"年"+" "+emp1.birthday.month+"月"+" "+emp1.birthday.days+"日");

        //替换为：
        emp1.show();

        System.out.println(emp1.show1());

        //创建Employee的第二个对象
        Employee emp2 = new Employee();



    }
}
