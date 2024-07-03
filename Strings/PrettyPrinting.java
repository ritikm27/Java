public class PrettyPrinting {
    public static void main(String[] args) {
        int a=10;
        String name="Ritik";

//        System.out.printf("Hello I am %s",name);
//        System.out.println();
//        System.out.printf("the number is %d",a);

        float num=42.345234534f;
        double num1=53.342345323234232;
        System.out.printf("%.50f & %.50f",num,num1);

        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("%.3f",Math.PI);
        //%f is used for float but it can also be used for double by using (.n or %.nf)
        //where n is the number of digits after decimal and it also round off the numbers after decimal

        //search for java placeholders on google
    }
}
