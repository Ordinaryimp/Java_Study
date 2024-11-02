package com.two;

import java.util.Scanner;

/**
 * ClassName:palindrome
 * Package:com.two
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/2 22:46
 * @Version 1.0
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        String str = num+"";
        int right = str.length()-1;
        int left = 0;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(num+"不是回文数");
                break;
            }
            if(left==right){
                System.out.println(num+"是回文数");
            }
            left++;
            right--;
        }
        scanner.close();

    }
}
