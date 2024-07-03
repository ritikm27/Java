public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i=0;i<26;i++){
            char ch= (char)('a'+i);
            series +=ch;
            // here everytime we add a new character or ch to series a new object will form and the series will have reference of that
            // new object created and this causes a lot of memory waste
        }

        // time complexity of this loop is O(N2) because everytime a new object is created and all the elements of previous object gets copied in the
        // new object and hence this copying part consumes more time
        System.out.println(series);


    }
}
