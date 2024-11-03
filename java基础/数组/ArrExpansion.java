package com.two;

/**
 * ClassName:ArrExpansion
 * Package:com.two
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/3 15:22
 * @Version 1.0
 */
public class ArrExpansion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr1 = new int[arr.length<<1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr.length] = 6;
        arr1[arr.length+1] = 7;
        arr1[arr.length+2] = 8;

        arr=arr1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
