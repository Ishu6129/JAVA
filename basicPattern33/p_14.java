package GLA.pattern;

import java.util.Scanner;

public class p_14 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=1;
        int p=0;
        int j=a;
        while (i<2*a){
            if (i>a){
                j++;
                p--;
            }
            else{
            j--;
            p++;
            }
            System.out.print("  ".repeat(j));
            System.out.println("* ".repeat(p));
        i++;
        }
            System.out.println();
        }
    }


