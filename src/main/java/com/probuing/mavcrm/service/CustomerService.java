package com.probuing.mavcrm.service;

import com.probuing.mavcrm.entity.Customer;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/7/13 09:46
 * @Description:
 */
public interface CustomerService {
    Customer findById(Long custId);
}
