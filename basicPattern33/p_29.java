package GLA.Pattern;

public class p_29 {
    public static void main(String[] arg) {
        int a=5;
        int i=0;
        int c=0;
        int s=0;
        int t=0;
        while (i<a){
            int j=0;
            while (j<(a-i-1)){
                System.out.print("  ");
                j++;
            }
            i++;
            s=i;
            c++;
            t=c;
            System.out.print(t+" ");
            while(s-1>0){
                System.out.print(0);
                System.out.print(" ");
                s--;
                t++;
            }
            while (t-1>c){
                System.out.print(0);
                System.out.print(" ");
                t--;
            }
            if (t>1){
            System.out.print(t-1);}
            System.out.println();
        }

    }
}
