package com.five;

/**
 * ClassName:Customer
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 19:53
 * @Version 1.0
 */
public class Customer {
    private String firstname;
    private String lastname;
    private Account account;

    public Customer(String f,String l){
        firstname = f;
        lastname = l;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account a){
        account = a;
    }
}
