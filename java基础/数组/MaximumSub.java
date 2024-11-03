package com.two;

/**
 * ClassName:MaximumSub
 * Package:com.two
 * Description:
 * *输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和.
 * *求所有子数组的和的最大值。要求时间复杂度为0(N)。
 * 例如:输入的数组为1，-2，3，-10，-4，7，2，-5，和最大的子数组为3，10，-4，7，2，
 * 因此输出为该子数组的和18
 *
 * @Author mzy
 * @Create 2024/11/3 21:28
 * @Version 1.0
 */
public class MaximumSub {
    public static void main(String[] args)
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSub(arr);
        System.out.println(max);
    }
    public static int maxSub(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
