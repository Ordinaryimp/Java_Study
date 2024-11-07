package com.six;

/**
 * ClassName:BankTest
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/7 15:55
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("张","三");
        bank.addCustomer("李","四");
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println("账户余额为："+bank.getCustomer(0).getAccount().getBalance());

    }
}
