package com.suhas.rules;

import com.suhas.dto.Customer;
import com.suhas.dto.CustomerType;

public class ExisitngRuleImpl implements DiscountRule
    {
        public double CalculateCustomerDiscount(Customer customer)
        {
            if (CustomerType.EXISTING.equals(customer.getCustomerType()))
            {
                return  .05;
                }
            return 0;
        }
    }