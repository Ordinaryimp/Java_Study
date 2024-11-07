package com.six;

/**
 * ClassName:Boy
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/7 14:53
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {

    }
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shut(){
        if(this.age>=22){
            System.out.println("终于可以结婚了");
        }else{
            System.out.println("等年龄到再结婚吧");
        }
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
