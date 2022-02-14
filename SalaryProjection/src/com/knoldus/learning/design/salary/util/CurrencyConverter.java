package com.knoldus.learning.design.salary.util;

import java.util.HashMap;
import java.util.Map;

import com.knoldus.learning.design.salary.entity.Employee;

public class CurrencyConverter {

    public static Map<CurrencyType, Double> currencyCurrentConversionRate = new HashMap<>();

    static {
        currencyCurrentConversionRate.put(CurrencyType.INR, 1.0);
        currencyCurrentConversionRate.put(CurrencyType.Doller, 75.0);
        currencyCurrentConversionRate.put(CurrencyType.NepaleseRupee, 0.6);
        currencyCurrentConversionRate.put(CurrencyType.Euro, 84.0);
    }

    public static double getSalaryInBaseCurrency(Employee employee) {

        double rate = currencyCurrentConversionRate.get(employee.getSalary().getCurrency());
        return rate * employee.getSalary().getAmount();

    }
}
