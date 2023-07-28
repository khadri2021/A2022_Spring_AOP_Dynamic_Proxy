package com.khadri.spring.core.dynamic.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        IEmployee employee = new Employee();
        EmployeeInvocationHandler handler = new EmployeeInvocationHandler(employee);

        IEmployee proxyInstance = (IEmployee)Proxy.newProxyInstance(Employee.class.getClassLoader(), new Class[]{IEmployee.class}, handler);
        proxyInstance.setSalary(-50000.00);
        proxyInstance.payHike(10000.00);
        proxyInstance.payCut(10000.00);

        System.out.println(employee.getSalary());
    }
}

