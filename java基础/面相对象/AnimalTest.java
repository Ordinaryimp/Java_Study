package com.five;

/**
 * ClassName:AnimalTest
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 10:22
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "金蟾";
        //因为legs是 private的 出了Animal类就你呢个用了，只能用方法 setLegs间接赋值
//        animal.legs = 3;
        animal.setLegs(6);
        animal.eat();
        System.out.println("neme = "+animal.name+",legs = "+animal.getLegs());
    }

}
class Animal{
    //属性
    String name;//名字
    private int legs;//腿个数
    public int getLegs(){
        return legs;
    }

    public void setLegs(int l){
        if(l>=0&&l%2==0){
            legs = l;
        }else{
            System.out.println("输入数据不合法");
        }
    }
    //方法
    public void eat(){
        System.out.println("动物觅食");
    }
}
