package GLA.Pattern;
import java.util.*;
public class p_18 {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int space=num/2;
        int spaceit=0;
        int star=1;
        int starloop=1;
        while (num>0){
            spaceit=space;
            while(spaceit>0){
                System.out.print("  ");
                spaceit--;
            }
            starloop=2*star-1;
            while(starloop>0){
                System.out.print("* ");
                starloop--;
            };
            if (num>(n/2)+1){
            star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
        num--;
        }
    }
}
