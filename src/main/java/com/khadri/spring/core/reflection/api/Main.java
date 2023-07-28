package com.khadri.spring.core.reflection.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<Employee> classObject = (Class<Employee>) Class.forName("com.khadri.spring.core.reflection.api.Employee");

//        String simpleName = classObject.getTypeName();
//        System.out.println(simpleName);

//         Method[] declaredMethods = classObject.getDeclaredMethods();
//        for (Method method:declaredMethods
//             ) {
//            System.out.println(method);
//        }
//
//
//        Constructor<Employee>[] constructors = (Constructor<Employee>[]) classObject.getDeclaredConstructors();
//
//        for (Constructor constructor :
//                constructors) {
//           constructor.setAccessible(true);
//            System.out.println(constructor);
//        }

        Constructor<Employee> employeeConstructor = classObject.getDeclaredConstructor(Integer.class,String.class);
        employeeConstructor.setAccessible(true);
        Employee employee1 = employeeConstructor.newInstance(100,"JHON");
        System.out.println(employee1.getId() + " " +employee1.getName());

        Method method = classObject.getDeclaredMethod("getId", null);
        method.invoke(employee1,null);

    }
}