package com.lab;

public class Student {
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Residence    : " + address.getCity());
    }
}
