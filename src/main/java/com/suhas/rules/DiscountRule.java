package com.suhas.rules;

import com.suhas.dto.Customer;

public interface DiscountRule
    {
	double CalculateCustomerDiscount(Customer customer);
    }