package Assignment_5;

import java.util.Scanner;
public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length();
        String temp="";
        while(i<s.length()){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                temp=temp+s.charAt(i);
            }
            else{
                temp=temp+s.charAt(i);
            }
            if(i<s.length()-1 && s.charAt(i+1) >= 65 && s.charAt(i+1) <= 90){
                System.out.println(temp);
                temp="";
            }
            i++;
        }
        System.out.println(temp);
    }
}
