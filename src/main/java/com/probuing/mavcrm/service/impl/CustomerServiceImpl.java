package com.probuing.mavcrm.service.impl;

import com.probuing.mavcrm.dao.CustomerDao;
import com.probuing.mavcrm.entity.Customer;
import com.probuing.mavcrm.service.CustomerService;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/7/13 09:49
 * @Description:
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Customer findById(Long custId) {
        return customerDao.findById(custId);
    }
}
