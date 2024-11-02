package com.one;

/**
 * ClassName:ArrTrain02
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 21:29
 * @Version 1.0
 */
public class ArrTrain02 {
    public static void main(String[] args)
    {
        //创建一个长度为6的Int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int num = (int)(Math.random()*30)+1;
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (num==arr[j])
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                arr[i]=num;
            }else {
                i--;
            }
            System.out.print(arr[i]+"\t");
        }
    }
}
