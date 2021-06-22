package com.zj.domain;

import java.io.Serializable;

public class Account implements Serializable {
    /*
    判断类的serialVersionUID来验证的版本一致的。在进行反序列化时，JVM会把传来的
    字节流中的serialVersionUID于本地相应实体类的serialVersionUID进行比较。如
    果相同说明是一致的，可以进行反序列化，否则会出现反序列化版本一致的异常，
    即是InvalidCastException。
     */
    private static final long serialVersionUID = 7355810572012650248L;


    private Integer id;
    private String name;
    private Double money;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
