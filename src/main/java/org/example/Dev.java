package org.example;

public class Dev {
    private int age;
    private Laptop laptop;

    public Dev(Laptop laptop){
        System.out.println("Dev class constructor.");
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Working on an awesome project");
        laptop.compile();
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("Age has been set at " + age);
    }
}
