package com.four;

/**
 * ClassName:VaDaTyTest
 * Package:com.four
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 17:03
 * @Version 1.0
 */
public class VaDaTyTest {
    public static void main(String[] args) {
        VaDaTyTest vdt = new VaDaTyTest();
        String s = vdt.comnnect("-","hello","world","java");
        System.out.println(s);
        System.out.println(vdt.comnnect("/", "Hello", "World", "I", "Love", "You"));
    }
    //n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串“”
    public String comnnect(String operator,String ... str){
        String result = "";
        for (int i = 0; i < str.length; i++) {
            if(i==0){
                result+=str[i];
            }else {
                result+=operator+str[i];
            }
        }
        return result;
//        for (int i = 0; i < str.length; i++) {
//            if(i==str.length-1){
//                result+=str[i];
//                return result;
//            }
//            result+=(str[i]+operator);
//        }
//        return "";
    }

}
