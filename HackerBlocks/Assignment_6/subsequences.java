package Assignment_6;
import java.util.*;
public class subsequences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ques=sc.nextLine();
        System.out.println("\n"+print(ques,"",0));
    }

    public static int print(String ques,String ans,int count) {
        if(ques.isEmpty()){
            System.out.print(ans+" ");
            return 1;
        }
        char ch=ques.charAt(0);
        int a=print(ques.substring(1),ans,count);
        int b=print(ques.substring(1),ans+ch,count);
        return a+b;
    }
}

//abcd

//d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
//16
