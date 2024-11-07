package com.six;

/**
 * ClassName:Customer
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/7 15:40
 * @Version 1.0
 */
public class Customer {
    private String firstname;
    private String lastname;

    private Account account;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Account getAccount() {
        return account;
    }
}
