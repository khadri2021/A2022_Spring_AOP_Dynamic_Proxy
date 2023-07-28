package com.khadri.spring.core.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler {

    private IEmployee targetObject;

    EmployeeInvocationHandler(IEmployee targetObject){
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("EmployeeInvocationHandler starts "+proxy.getClass()+" : "+method.getName());
        String name = method.getName();
        if(name.equals("payHike") || name.equals("payCut") || name.equals("setSalary")){
            Double amount = (Double) args[0];
            if(amount > 0){
                method.invoke(targetObject,args);
            }else {
                throw new RuntimeException(name+" Amount is negative");
            }
        }
        System.out.println("EmployeeInvocationHandler ends");
        return  method.invoke(targetObject,args);
    }

}
