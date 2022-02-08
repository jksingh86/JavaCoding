package com.knoldus.learning.design.salary.util;

import java.util.HashMap;
import java.util.Map;

import com.knoldus.learning.design.salary.entity.Employee;

public class CurrencyConverter {


    public static Map<String, Double> currencyCurrentConversionRate = new HashMap<>();
    
    static {
    	currencyCurrentConversionRate.put("Rupee", 1.0);
    	currencyCurrentConversionRate.put("Dollar", 75.0);
    	currencyCurrentConversionRate.put("Nepalese Rupee", 0.6);
    	currencyCurrentConversionRate.put("Euro", 84.0);
    }

    public static double getSalaryInBaseCurrency(Employee employee) {

        Double rate = currencyCurrentConversionRate.get(employee.getSalary().getCurrency());
        return rate * employee.getSalary().getAmount();

    }
}
