package com.one;

/**
 * ClassName:YangHuiTest
 * Package:com.one
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 21:03
 * @Version 1.0
 */
public class YangHuiTest {
    public static void main(String[] args) {
        //创建二维数组
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < arr[i].length-1; j++) {
//                if (i>1){
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//                }

            }
        }
        //遍历赋值
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 1; j < arr[i].length-1; j++) {
//                if(i>1){
//                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//                }
//            }
//        }
        //打印
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
