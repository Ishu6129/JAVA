package codeforces;

import java.util.Scanner;

public class morningSandwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int bread=sc.nextInt();
            int cheese=sc.nextInt();
            int ham=sc.nextInt();
            System.out.println(fndlayer(bread,cheese+ham));
            n--;
        }
    }
    public static int fndlayer(int bread,int filling){
            if(filling<bread){
                return (2*filling)+1;
            }
            else if(filling>bread){
                return (2*bread)-1;
            }
            else{
                return 2+(2*bread-3);
            }
    }
}
