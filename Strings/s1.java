public class s1 {
    public static void main(String[] args) {

        String a="Ritik"; //this will store in string pool section of heap memory
        String b="Ritik"; //this will also store in string pool section of heap memory
        System.out.println(a==b);
        //In strings (==) operator checks whether the both reference variables contains the reference of same object or not


        String a1=new String("Ritik");
        String b1=new String("Ritik");
        System.out.println(a1==b1);
        //this will give false because a1 & b1 contains reference of different objects in heap
        //String objects created using "new" keyword do not store in string pool like other string objects
        //because all the objects created using "new" keyword irrespective of data type are created in heap

        System.out.println(a1.equals(b1));
        //(obj1.equals(obj2)) method compares the values contain in the objects
        System.out.println(a.equals(b));

    }
}
