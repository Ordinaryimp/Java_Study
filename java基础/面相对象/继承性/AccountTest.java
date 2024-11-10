package com.nine;

/**
 * ClassName:AccountTest
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 20:51
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("123",1000,0.05);
        account.withdraw(30000);
        System.out.println("你当前的余额为:"+account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("你当前的余额为:"+account.getBalance());
        System.out.println("你当前的月利率为:"+String.format("%.2f%%",account.getAnnualInterestRate()*100));


    }
}
