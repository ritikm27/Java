import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        int a=10;
        String name="Ritik";

        System.out.println(1+4);//int + int  here '+' will act as addition operator
        System.out.println(name+a);//string + int
        System.out.println("Ritik More "+ 11);
        // now here if we take 'a' or 11 the compiler will convert it into its wrapper class
        // that is Integer and every class in the end calls the toString method of print() function
        // such that in the end the expression will become like ("Ritik More" + "11")
        // that is in the end the whole expression will become a string and will get concatenate

        System.out.println("Ritik" + new ArrayList<>()); // this will be printed as Ritik[] because there is one string in
//        System.out.println(new ArrayList<>() + new Integer(5));
        // this is an expression this will not be printed and will throw error because there is no string present
        // and to print an expression like this we need to add or concatenate a string between them
        // because of this toString method of print() will get called for the objects of other types and the whole expression will become a string

        System.out.println(new ArrayList<>() +""+ new Integer(5) );


    }
}
