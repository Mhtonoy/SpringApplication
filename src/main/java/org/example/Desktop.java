package org.example;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop class constructor");
    }
    public void compile(){
        System.out.println("Compile with Desktop.");
    }
}
