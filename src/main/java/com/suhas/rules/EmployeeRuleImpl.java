package com.suhas.rules;

import com.suhas.dto.Customer;
import com.suhas.dto.CustomerType;

public class EmployeeRuleImpl implements DiscountRule
    {
        public double CalculateCustomerDiscount(Customer customer)
        {
            if (CustomerType.EMPLOYEE.equals(customer.getCustomerType()))
            {
                return  .30;
                }
            return 0;
        }
    }