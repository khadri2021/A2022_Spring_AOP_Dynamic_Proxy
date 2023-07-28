package com.khadri.spring.core.dynamic.proxy;

public class Employee implements IEmployee {

    private Double salary;

    @Override
    public void payHike(Double amount) {
        this.salary = salary + amount;
    }

    @Override
    public void payCut(Double amount) {
        this.salary = salary - amount;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
