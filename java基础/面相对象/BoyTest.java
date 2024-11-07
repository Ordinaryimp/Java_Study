package com.six;

/**
 * ClassName:BoyTest
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/7 15:21
 * @Version 1.0
 */
public class BoyTest {
    public static void main(String[] args) {
        Boy boy = new Boy("Jack", 18);
        Girl girl1 = new Girl("Lucy", 20);
        girl1.marry(boy);
        boy.shut();
        Girl girl2 = new Girl("Mary", 21);

        int compare = girl1.compare(girl2);
        if(compare>0){
            System.out.println(girl1.getName()+"年龄大");
        }else if(compare<0){
            System.out.println(girl2.getName()+"年龄大");
        }else{
            System.out.println("一样大");
        }
    }
}
