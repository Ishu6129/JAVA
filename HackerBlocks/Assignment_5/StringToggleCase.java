package Assignment_5;

import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                System.out.print((char)(32+s.charAt(i)));
            }
            else{
                System.out.print((char)(s.charAt(i)-32));
            }
        }
    }
}
