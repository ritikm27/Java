public class StringSort {
    public static void main(String[] args) {
        String s="coderbyte";
        System.out.println(Ssort(s));
        System.out.println(Number(4,4));
    }

    static String Ssort(String Str){

        char[] ch=Str.toCharArray();

        for(int i=0;i<Str.length();i++){
            for(int j=i+1;j<Str.length();j++){
                if(ch[i]>=ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        String s= new String(ch);
        return s;

    }

    static String Number(int num1, int num2){

//        String t,f,a;
//        t="true";
//        f="false";
//        a="-1";

        if(num1==num2){
            return "-1";
        }
        else if(num2>num1){
            return "true";
        }
        else{
            return "false";
        }
    }

}

