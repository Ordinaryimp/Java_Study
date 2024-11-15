package com.eleven;

/**
 * ClassName:AccountTest
 * Package:com.eleven
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/15 15:08
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1);
        Account acc2 = new Account("21786478", 10000);
        System.out.println(acc2);

        Account.setInterestRate(0.05);
        Account.setMinBalance(1);
        System.out.println("银行利率为："+acc2.getInterestRate());
        System.out.println("最小余额为："+acc2.getMinBalance());

    }
}
