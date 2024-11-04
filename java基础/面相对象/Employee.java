package com.three;

/**
 * ClassName:Employee
 * Package:com.three
 * Description:
 *
 *声明员工类员工，包含属性:编号id、姓名姓名、年龄年龄、薪资薪水。
 * 声明Employee测试测试类，并在Main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 *
 * @Author mzy
 * @Create 2024/11/4 14:48
 * @Version 1.0
 */
public class Employee {
    //属性
    String id;  //编号
    String name;  //姓名
    int age;    //年龄
    double salary;  //薪水

    Mydate birthday;//生日

    static  String info = "员工"; //static修饰  所有对象公用一份

    //定义一个方法调用实例属性
    public void show(){
        System.out.println("编号为:"+id+" "+"姓名为:"+name+" "+"年龄为:"+age+" "+"薪资为:"+salary+" "+
                "生日为:"+birthday.year+"年"+" "+birthday.month+"月"+" "+birthday.days+"日");
    }

    public String show1(){
        return "编号为:"+id+" "+"姓名为:"+name+" "+"年龄为:"+age+" "+"薪资为:"+salary+" "+
                "生日为:"+birthday.year+"年"+" "+birthday.month+"月"+" "+birthday.days+"日";
    }

}
