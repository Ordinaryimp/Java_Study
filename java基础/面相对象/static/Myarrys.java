package com.eleven;

/**
 * ClassName:Myarrys
 * Package:com.three
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/4 21:16
 * @Version 1.0
 */
public class Myarrys {
    int average = 0;
    public static int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max=arr[0];
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min=arr[0];
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int getAverage(int[] arr){
        return getSum(arr)/arr.length;
    }
    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.print(arr[i]);
            }

            else{
                System.out.print(","+arr[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
    public static int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static void reserve(int[] arr){
        for (int i = 0,j= arr.length-1;i<j;i++,j--) {
            int temp;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    //数组排序 从小到大
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void sort(int[] arr,String sortMethod){
        if("asc".equals(sortMethod)){   //ascend 升序
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j]>arr[j+1]){
                        swap(arr,j,j+1);
//                        int temp;
//                        temp = arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
                    }
                }
            }
        }else if("desc".equals(sortMethod)){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j]<arr[j+1]){
                        swap(arr,j,j+1);
//                        int temp;
//                        temp = arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
                    }
                }
            }
        }else{
            System.out.println("你输入的排序方式有误");
        }
    }
    //数组排序 从大到小
    public static void sortReverse(int[] arr){
            sort(arr);
            reserve(arr);
    }
    //线性查找目标数下标
    public static int lineSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
