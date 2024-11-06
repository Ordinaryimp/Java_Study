package com.five;

/**
 * ClassName:Book
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 11:12
 * @Version 1.0
 */
public class Book {
    private String bookName;//书名
    private String author;//作者
    private double price;//价格
    public String getBookNmae(){
        return bookName;
    }
    public void setBookNmae(String n){
        bookName=n;
    }
    public String getauthor(){
        return author;
    }
    public void setauthor(String a){
        author=a;
    }
    public Double getprice(){
        return price;
    }
    public void setprice(Double p){
        price=p;
    }
    //获取图书信息
    public String showInfo(){
        return "bookName: "+bookName+";author: "+author+";price: "+price;
    }
}

