package com.four;

/**
 * ClassName:VariableDataType
 * Package:com.four
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/5 16:28
 * @Version 1.0
 */
public class VariableDataType {
    public static void main(String[] args) {
        VariableDataType vdt = new VariableDataType();
        vdt.print(1,2,3,4,5);
        vdt.print();
    }
    //可变数据个数形参
    public void print(int ... nums){
        System.out.println("1");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    //public void print(int ... nums,int number){}    //可变形参数必须放在 形参列表 最后 且在一个方法的形参列表中最多只能存在一个
    //特例：
//    public void print(int[] num){
//        System.out.println("4");
//    }
    //重载优先级高
    public void print(int num1,int num2,int num3,int num4){
        System.out.println("2");
    }
    public void print(int num1){
        System.out.println("3");
    }
}
