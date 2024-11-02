package com.one;

/**
 * ClassName:DoubleArrExer
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 17:56
 * @Version 1.0
 */
public class DoubleArrExer {
    public static void main(String[] args) {
        //创建二维数组方式
        int x,y[];  //x为一维  y为二维
        int[][] arr = new int[][]{{1,2,3},{4,5,6,},{7,8,9}};
        String[][] arr2 = new String[3][4];
        double[][] arr3 = new double[2][];
        //arr外层元素{1,2,3},{4,5,6,},{7,8,9}   内层元素1,2,3,4,5,6,7,8,9,
        //调用内层元素 1
        System.out.println(arr[0][0]);  //1
        System.out.println(arr[2][1]);  //7
        //调用外层元素 {1,2,3}
        System.out.println(arr[0]); //[I@4eec7777
        //测试 arr2 arr3
        arr2[0][1]="Tom";
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0]);    //[Ljava.lang.String;@41629346
        System.out.println(arr3[0]);    //null

        arr3[0] = new double[4];    //给arr3[0]内赋 一个 分配4个内存的数组
        System.out.println(arr3[0]);    //[D@41629346
        arr3[0][1]=3.14;
        System.out.println(arr3[0][1]);

        //数组的长度
        System.out.println(arr.length); //{{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println(arr[0].length);//3

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
