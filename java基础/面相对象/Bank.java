package com.six;

/**
 * ClassName:bank
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/7 15:49
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;//保存多个客户
    private int numberOfCustomer;//客户的数量

    public Bank() {
        customers = new Customer[10];
    }
    public void addCustomer(String firstName, String lastName) {
        Customer cust = new Customer(firstName,lastName);
        customers[numberOfCustomer++] = cust;
//        numberOfCustomer++;
    }
    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){
        if(index>=0&&index<=numberOfCustomer){
            return customers[index];
        }else{
            return null;
        }
    }
}
