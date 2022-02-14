package com.knoldus.learning.design.salary.util;

import java.util.HashMap;
import java.util.Map;

import com.knoldus.learning.design.salary.entity.Employee;
import com.knoldus.learning.design.salary.type.CurrencyType;

public class CurrencyConverter {


    public static Map<CurrencyType, Double> currencyCurrentConversionRate = new HashMap<>();
    
    static {
    	currencyCurrentConversionRate.put(CurrencyType.INR, 1.0);
    	currencyCurrentConversionRate.put(CurrencyType.USD, 75.0);
    	currencyCurrentConversionRate.put(CurrencyType.EURO, 0.6);
    	currencyCurrentConversionRate.put(CurrencyType.YEN, 84.0);
    }

    public static double getSalaryInBaseCurrency(Employee employee) {

        Double rate = currencyCurrentConversionRate.get(employee.getSalary().getCurrency());
        return rate * employee.getSalary().getAmount();

    }
}
