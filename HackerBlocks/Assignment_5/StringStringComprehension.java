package Assignment_5;

import java.util.Scanner;

public class StringStringComprehension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int c=1;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i-1)==s.charAt(i)){
                c++;
            }
            if(!(s.charAt(i-1)==s.charAt(i))){
                System.out.print(s.charAt(i-1));
                if(c>1){
                    System.out.print(c);
                }

                c=1;
            }
            i++;
        }
        System.out.print(s.charAt(i-1));
        if(c>1){
            System.out.print(c);
        }
    }
}
