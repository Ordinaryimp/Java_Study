package com.nine;

/**
 * ClassName:Account
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 20:42
 * @Version 1.0
 */
public class Account {
    private String id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率
    public Account(){

    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取月利率
     * @return
     */
    public double getMonthlyInterest(){
        return getAnnualInterestRate()/12;
    }
    public void withdraw(double amount){
        if(amount<=balance&&amount>0){
            balance-=amount;
            System.out.println("成功取出"+amount);
        }else{
            System.out.println("余额不足");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("成功存入"+amount);
        }else{
            System.out.println("存入的金额必须大于0");
        }
    }
}
