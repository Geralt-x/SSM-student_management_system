package com.ssm.service.impl;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户执行了...");
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查找所有账户...");
        return accountDao.findAll();
    }
}
