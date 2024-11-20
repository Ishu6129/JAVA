package Assignment_5;

import java.util.Scanner;

public class StringOddEvenCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print((char)(1+s.charAt(i)));
            }
            else{
                System.out.print((char)(s.charAt(i)-1));
            }
        }
    }
}
