package org.example;

public class Dev {
    private Computer com;

    public Dev(){
        System.out.println("Dev class constructor.");
    }

    public void setCom(Computer com){
        this.com = com;
    }

    public void build(){
        System.out.println("Working on an awesome project");
        com.compile();
    }

}
