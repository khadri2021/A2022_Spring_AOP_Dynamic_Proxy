package com.khadri.spring.core.dynamic.proxy;

public interface IEmployee {
    void payHike(Double amount);
    void payCut(Double amount);

    void setSalary(Double salary);
    Double getSalary();
}
