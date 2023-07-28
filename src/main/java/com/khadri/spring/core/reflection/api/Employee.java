package com.khadri.spring.core.reflection.api;

public class Employee {

    private Integer id;
    private String name;

    public Integer getId() {
        System.out.println("Hello I am getId");
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Employee() {

    }

   private Employee(Integer id) {
        this.id = id;
    }

    private Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
