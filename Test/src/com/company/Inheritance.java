package com.company;

public class Inheritance {

    static class parent{

//        parent(){
//            System.out.println(" Parent class Constructor");
//        }
        public void show(){
            System.out.println("Parent");
        }
    }
    static class child extends parent{

//        child(){
//            System.out.println("child class constructor");
//        }
        public void show(){
            System.out.println("Child");
        }

        public void getChild1(){
            System.out.println("It is child");
        }
    }

    static class grandChild extends child{

         public void show(){
            System.out.println("grandChild");
        }

//        grandChild(){
//             super.show();
//            System.out.println("grandChild class Constructor");
//        }

         void getChild(){
            System.out.println("It is grandChild");
        }
    }

    public static void main(String[] args) {
        grandChild gc= new grandChild();
        parent p= new child();
//        grandChild g = new child();
        gc.getChild();
        gc.getChild1();
        System.out.println("-------------------------------------");
        System.out.println(gc instanceof parent);
//        g.show();

    }
}

