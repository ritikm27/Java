package com.company;

public class Interface {
    public static void main(String[] args) {
        hyundai obj= new hyundai();
        obj.show();
        obj.name();
        System.out.println(obj.avg());
        obj.naamBatao();

        cars objIn= new hyundai();
        objIn.show();

        System.out.println(cars.a);

    }
}

interface cars{
    void show();
    int avg();
    int a=10;
    default void naamBatao(){
        System.out.println("default method in interface");
    }
}

interface truck extends cars{
    void show();
    void name();
}

class hyundai implements truck{

    public void show(){
        System.out.println("hyundai");
    }
    public void name(){
        System.out.println(" it is a truck");
    }
    public int avg(){
        return 20;
    }

    @Override
    public void naamBatao() {
        System.out.println("override the default method");
    }
}


