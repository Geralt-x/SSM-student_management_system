package com.ssm.service;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {


    public void saveAccount(Account account);

    public List<Account> findAll();

}
