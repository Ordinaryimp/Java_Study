package com.six;

import java.sql.Date;

/**
 * ClassName:JavaBean
 * Package:com.six
 * Description:
 *
 * @Author mzy
 * @Create 2024/11/6 21:37
 * @Version 1.0
 */
public class JavaBean {
    public JavaBean() {

    }
    private int id;
    private String name;
    private String email;
    private Date birth;

    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
