package com.one;

/**
 * ClassName:String
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/14 20:42
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
     String str = "hello";
     StringGet stringGet = new StringGet();
     stringGet.set(str);
     System.out.println(stringGet.names[0]);
     str = "world";
     System.out.println(stringGet.names[0]);
     //原因是：String类中的值是final的，一旦被赋值，就不能再被修改，str = "world"，相当于重新给str赋值，
        // 即str换了一个String实例对象指向而不是修改原来的值.
    }
}
class StringGet{
    public String[] names;
    public int sge;
    public void set(String... names){
        this.names = names;
    }

}