package com.zj.service.impl;

import com.zj.dao.AccountDao;
import com.zj.domain.Account;
import com.zj.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return null;
    }
}
