package com.company;

public class MultiThreading {
    public static void main(String[] args) {
        test t1 = new test();
        test2 t2= new test2();
        t1.start();
        t2.start();
    }
}

class test extends Thread{
    public void run(){
        while(true) {
            System.out.println("Thread 1111111111111111");
        }
    }

}

class test2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Thread 222222222222222222");
        }
    }

}
