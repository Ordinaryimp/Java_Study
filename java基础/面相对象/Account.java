package com.six;

/**
 * ClassName:Account
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/7 15:33
 * @Version 1.0
 */
public class Account {
    private double balance;//余额
    public Account(double init_balance){
        this.balance = init_balance;
    }
    public double getBalance() {
        return balance;
    }
    //存钱
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
        }else{
            System.out.println("存钱失败，金额不合法");
        }
    }
    //取钱
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("取钱失败，余额不足");
        }
    }
}
