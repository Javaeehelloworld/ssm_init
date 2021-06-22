package com.zj.dao;

import com.zj.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {

    @Select("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    @Select("select * from account")
    public List<Account> findAll();
}
