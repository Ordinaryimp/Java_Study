package com.five;

/**
 * ClassName:BookTest
 * Package:com.five
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 11:23
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookNmae("九阳真经");
        book1.setauthor("张三丰");
        book1.setprice(10.0);

        System.out.println(book1.showInfo());
    }
}
