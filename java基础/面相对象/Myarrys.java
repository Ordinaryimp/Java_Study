package com.three;

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
    public int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max=arr[0];
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min=arr[0];
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public int getAverage(int[] arr){
        return getSum(arr)/arr.length;
    }
    public void print(int[] arr){
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
    public int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public void reserve(int[] arr){
        for (int i = 0,j= arr.length-1;i<j;i++,j--) {
            int temp;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    //数组排序 从小到大
    public void sort(int[] arr){
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
    //数组排序 从大到小
    public void sortReverse(int[] arr){
            sort(arr);
            reserve(arr);
    }
    //线性查找目标数下标
    public int lineSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
