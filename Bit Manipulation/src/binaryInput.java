import java.util.Scanner;

public class binaryInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int b1=s.nextInt(2);
        // here we add base in ( base ) brackets to take the input in desired number system
        // but when we print it directly by name it will print the base10 value
        System.out.println(b1);

        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toString(b1,2));
    }
}
