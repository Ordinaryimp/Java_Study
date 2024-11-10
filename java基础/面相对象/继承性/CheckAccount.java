package com.nine;

/**
 * ClassName:CheckAccount
 * Package:com.nine
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/10 21:06
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overDraft;//透支额度
    public CheckAccount(String id, double balance, double annualInterestRate){
        super(id,balance,annualInterestRate);
    }
    public CheckAccount(String id, double balance, double annualInterestRate,double overDraft){
        super(id,balance,annualInterestRate);
        this.overDraft=overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    /**
     * 针对透支用户的取款
     * @param amount
     */
    public void withdraw(double amount){
        if(amount<=getBalance()){
            super.withdraw(amount);
        }else{
            //判断透支额度是否足够
            if(amount<=getBalance()+getOverDraft()){
                //透支额度足够
                double overAmount=amount-getBalance();
                super.withdraw(getBalance());
                overDraft-=overAmount;
            }else{
               System.out.println("透支额度不足，取款失败");
            }
        }
    }
}
