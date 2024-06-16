package org.example;

public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop class constructor");
    }
    public void compile(){
        System.out.println("Compile with laptop.");
    }
}
