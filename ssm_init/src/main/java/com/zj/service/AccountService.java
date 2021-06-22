package com.zj.service;

import com.zj.domain.Account;

import java.util.List;

public interface AccountService {
    public void saveAccount(Account account);
    public List<Account> findAll();
}
