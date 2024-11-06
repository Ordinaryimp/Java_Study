package com.five;

/**
 * ClassName:CustomerTest
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 20:25
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
//        Account account = new Account(1000,2000,0.0123);
//        customer.setAccount(account);
        //或    匿名对象方式
        customer.setAccount(new Account(1000,2000,0.0123));
        //针对于客户的账户进行取钱存钱操作
        customer.getAccount().deposit(10000);
        customer.getAccount().withdraw(500);
        customer.getAccount().withdraw(50);

        //输出客户信息
        System.out.println(customer.getFirstname()+customer.getLastname()+" has a Id is:"+customer.getAccount().getId()+" 的年利率为："
                +customer.getAccount().getAnnualInterestRate()*100+"%"+ " 余额为："+customer.getAccount().getBalance());
//        account.deposit(100);
//        account.withdraw(800);
        //关于匿名对象  往往只能调用一次 常常作为实参传递给方法的形参
        new Account(1000,2000,0.0123).deposit(100);
        System.out.println(new Account(1000, 2000, 0.0123).getBalance());
    }
}
