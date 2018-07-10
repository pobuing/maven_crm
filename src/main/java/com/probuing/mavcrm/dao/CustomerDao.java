package com.probuing.mavcrm.dao;

import com.probuing.mavcrm.entity.Customer;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/7/10 18:38
 * @Description:
 */
public interface CustomerDao {
    Customer findById(Long id);
}
