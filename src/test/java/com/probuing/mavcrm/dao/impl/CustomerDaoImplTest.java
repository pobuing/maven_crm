package com.probuing.mavcrm.dao.impl;

import com.probuing.mavcrm.dao.CustomerDao;
import com.probuing.mavcrm.entity.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/7/10 18:48
 * @Description:
 */
public class CustomerDaoImplTest {

    @Test
    public void findById() {
        ApplicationContext aContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) aContext.getBean("customerDao");
        Customer customer = customerDao.findById(12l);
        System.out.println("**********" + customer.getCustName());
    }
}