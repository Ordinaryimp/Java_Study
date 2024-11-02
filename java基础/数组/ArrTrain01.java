package com.one;

/**
 * ClassName:ArrTrain01
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 20:45
 * @Version 1.0
 */
public class ArrTrain01 {
    public static void main(String[] args)
    {
        int[] arr =new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*99-10+1)+10; //[10,99]
        }
        // 求最大值 平均值 和 最小值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("平均值为："+(sum/arr.length));
        System.out.println("总和为："+sum);
        System.out.println("去掉最大值和最小值的平均值为："+(sum-min-max)/(arr.length-2));
    }
}
