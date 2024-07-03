package com.company;

public class AbstractClass {
    public static void main(String[] args) {
        Ritik ch= new Beta();
        ch.show();
        ch.printname();
        Ritik.testFinal();
    }
}
interface great{
    void great();
    void nameit();
}
abstract class Ritik{
   abstract void show();
   void printname(){
       System.out.println("Parent Class");
   }
   static final void testFinal(){
       System.out.println("final method in abstract class");
   };

}

class Beta extends Ritik{
    void show(){
        System.out.println("Child Class ");
    }
//    void printname(){
//        System.out.println(" parent class inherited");
//    }
//    void testFinal(){
//        System.out.println("Final method in abstract class");
//    }
}