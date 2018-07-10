package com.probuing.mavcrm.dao.impl;

import com.probuing.mavcrm.dao.CustomerDao;
import com.probuing.mavcrm.entity.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/7/10 18:39
 * @Description:
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public Customer findById(Long id) {
        Customer customer = this.getHibernateTemplate().get(Customer.class, id);
        return customer;
    }
}
