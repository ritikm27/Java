import java.util.ArrayList;
import java.util.*;

public class test {
    public static void main(String[] args) {

    }

    static int ans(String[] str){
        String st= str.toString();

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<str.length;i++){

            if(str[i]=="R" && !list.isEmpty()){
                list.remove(list.size()-1);
            }
            if(str[i]=="T" && !list.isEmpty()){
                int a= list.get(list.size()-1);
                list.add(a*2);
            }
            if(str[i]=="+" && !list.isEmpty()){
                int a= list.get(list.size()-1);
                int b= list.get(list.size()-2);
                list.add(a+b);
            }
            else{
                Integer a=Integer.parseInt(str[i]);
                list.add(a);
            }
        }

        int sum=0;
        for (int i = 0; i <list.size() ; i++) {

            sum=list.get(i)+sum;
        }

        return 0;
    }
}
