package com.twelve;

/**
 * ClassName:GirlFriendTest
 * Package:com.twelve
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/16 14:11
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
    Bank b = Bank.getInstance();
    
    }
}
//懒汉式
class GirlFriend{
    //类的构造器私有化
    private GirlFriend(){

    }
    //2声明当前类的实例
    private static GirlFriend instance = null;

    //3.通过getXxx()获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
