package com.two;

/**
 * ClassName:ArrRevers
 * Package:com.two
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/3 9:47
 * @Version 1.0
 */
public class ArrReverse {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        //交换前
        System.out.println("交换前：");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        //方式一：
//        for(int i=0;i<arr.length;i++){
//            if(i<=arr.length-i -1){
//                int temp = 0;
//                temp = arr[i];
//                arr[i]=arr[arr.length-i-1];
//                arr[arr.length-i-1]=temp;
//            }
//        }

         //方式二：
        for(int i =0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }

//        //方式三： 不推荐，多了新的内存空间
//        int[] newarr = new int[arr.length];
//        for (int i = arr.length-1; i >=0; i--) {
//            newarr[arr.length - 1-i] = arr[i];
//        }
//        //将交换后数组地址赋给交换前数组
//        arr = newarr;
        System.out.println();
        //交换后
        System.out.println("交换后：");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

