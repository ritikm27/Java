package com.company;

public class Inheritance2 {
    public static void main(String[] args) {
        parent ch= new child();
        ch.show();
    }
}

class parent{
    public void show(){
        System.out.println("parent");
    }
}

class child extends parent{
    public void show(){
        System.out.println("child");
    }
}
