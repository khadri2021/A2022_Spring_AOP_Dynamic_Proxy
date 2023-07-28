package com.khadri.spring.core.dynamic.proxy;

public class EmployeeProtectionProxy extends Employee {

    @Override
    public void payCut(Double amount) {
        if (amount > 0) {
            super.payCut(amount);
        } else {
            throw new RuntimeException("payCut : Amount is negative and try with greater than zero");
        }
    }

    @Override
    public void payHike(Double amount) {
        if (amount > 0) {
            super.payHike(amount);
        } else {
            throw new RuntimeException("payHike : Amount is negative and try with greater than zero");
        }
    }
}
