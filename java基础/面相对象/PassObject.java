package com.four;

/**
 * ClassName:PassObject
 * Package:com.four
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 17:50
 * @Version 1.0
 */
public class PassObject {
    public void printAreas(Circle circle,int time){
        Circle   c = new Circle();
        int i = 1;
        System.out.println("Radius"+"\t\t\t\t"+"Area ");
        for (; i < time; i++){
            c.radious=i;
            System.out.println(c.radious+"\t\t\t\t\t"+c.findArea());
        }
        c.radious =i;
    }
}
