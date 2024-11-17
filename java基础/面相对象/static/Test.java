package com.thirteen;

/**
 * ClassName:Test
 * Package:com.thirteen
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/17 14:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Test1 test1 = Test1.getInstance();
        Test2 test2 = Test2.getInstance();
        System.out.println(test1);
        System.out.println(test2);

    }
}
class Test1{
    private Test1(){

    }
    private static Test1 test1 = new Test1();
    public static Test1 getInstance(){return test1;}
}
class Test2{
    private Test2(){

    }
    private static Test2 test2 = null;
    public static Test2 getInstance(){
        if(test2==null){
            test2=new Test2();
        }
        return test2;
    }
}
