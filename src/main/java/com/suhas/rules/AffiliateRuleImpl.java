package com.suhas.rules;

import com.suhas.dto.Customer;
import com.suhas.dto.CustomerType;

public class AffiliateRuleImpl implements DiscountRule
    {
        public double CalculateCustomerDiscount(Customer customer)
        {
            if (CustomerType.AFFILIATE.equals(customer.getCustomerType()))
            {
                return  .10;
                }
            return 0;
        }
    }