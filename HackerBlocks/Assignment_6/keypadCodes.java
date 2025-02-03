package Assignment_6;
import java.util.*;
public class keypadCodes {
    static String[] key={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String ques=sc.nextLine();
        System.out.println("\n"+print(ques,"",0));
    }
    public static int  print(String ques,String ans,int count){
        if(ques.isEmpty()){
            System.out.print(ans+" ");
            return 1;
        }
        char ch=ques.charAt(0);
        String s=key[ch-48];
        count=0;
        for(int i=0;i<s.length();i++){
            count+=print(ques.substring(1),ans+s.charAt(i),count);
        }
        return count;
    }
}
//12
//
//ad ae af bd be bf cd ce cf
//9