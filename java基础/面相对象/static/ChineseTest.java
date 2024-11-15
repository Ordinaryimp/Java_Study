package com.eleven;

/**
 * ClassName:Chinese
 * Package:com.eleven
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/15 13:47
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {

        System.out.println(Chinese.nation);
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.name = "王小明";
        c1.age = 18;
        c1.nation = "中国";

        Chinese c2 = new Chinese();
        c2.name = "江小鱼";
        c2.age = 19;
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c2.nation = "chinese";
        System.out.println(c2.nation);
        System.out.println(c1.nation);

        System.out.println(Chinese.nation);
    }
}

class Chinese{
    String name;
    int age;
    //静态成员变量/类变量
    static String nation = "东方大国";
    public void eat(){
        System.out.println("吃中国菜");
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void show(){
        System.out.println("我是一个中国人");
        System.out.println("国家"+nation);
        method1();

        //调用非静态结构
//        System.out.println("name="+this.name);
    }
    public void eat(String food){
        System.out.println("我喜欢吃"+food);
        method1();

    }
    public static void method1(){
        System.out.println("我是静态的测试方法");

    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }
}