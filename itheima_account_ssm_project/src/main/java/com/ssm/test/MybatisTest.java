package com.ssm.test;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis() throws Exception {
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建工厂
         SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
         AccountDao dao = session.getMapper(AccountDao.class);
        // 调用查询的方法
         List<Account> list = dao.findAll();
        for (Account account : list)
        { System.out.println(account); }
        // 释放资源
         session.close();
         inputStream.close();
    }

    /**
     * 测试saveAccount()
     * @throws Exception
     */
    @Test
    public void testSaveAccount() throws Exception {
        Account account = new Account();
        account.setName("王仙芝");
        account.setMoney(1000.00);
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建sqlSession对象
        SqlSession session = factory.openSession(true);
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 调用保存的方法
        dao.saveAccount(account);
        // 调用查询的方法
        List<Account> list = dao.findAll();
        for (Account _account : list)
        { System.out.println(_account); }

        // 释放资源
        session.close();
        inputStream.close();
    }
}
