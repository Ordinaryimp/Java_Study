package com.five;

/**
 * ClassName:Account
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 19:54
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;//年利率
    public Account(){

    }

    public Account(int i,double b,double a){
        id = i;
        balance = b;
        annualInterestRate = a;
    }
    public void withdraw(double amount){
        if(amount<=balance&&amount>0){
            balance-=amount;
            System.out.println("成功取出"+amount);
        }else{
            System.out.println("余额不足,取款失败");
        }
    }
    public void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println("成功存入"+amount);
            }
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }


}
