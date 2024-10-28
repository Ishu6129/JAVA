import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        while (i<a){
            int j=-1;
            while (j<i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
