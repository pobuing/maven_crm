package com.probuing.mavcrm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.probuing.mavcrm.entity.Customer;
import com.probuing.mavcrm.service.CustomerService;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/7/13 09:47
 * @Description:
 */
public class CustomerAction extends ActionSupport {
    private Long custId;
    private Customer customer;

    private CustomerService customerService;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String findCustomerById(){
        customer = customerService.findById(custId);
        return SUCCESS;
    }
}
