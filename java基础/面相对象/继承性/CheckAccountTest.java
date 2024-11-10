package com.nine;

/**
 * ClassName:CheckAccountTest
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 21:25
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount("1122",20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println("您的账户余额为:"+checkAccount.getBalance());
        checkAccount.withdraw(18000);
        System.out.println("您的账户余额为:"+checkAccount.getBalance());
        System.out.println("您的账户透支额度为:"+checkAccount.getOverDraft());
        checkAccount.withdraw(3000);
        System.out.println("您的账户余额为:"+checkAccount.getBalance());
        System.out.println("您的账户透支额度为:"+checkAccount.getOverDraft());

    }


}
