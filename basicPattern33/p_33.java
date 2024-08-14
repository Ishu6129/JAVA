package GLA.Pattern;

public class p_33 {
    public static void main(String[] arg){
        int a=10;
        int i=a;
        int t=0;
        int p=0;
        int j=0;
        while (i>0){
            j=i;
            while (j>1){
                System.out.print("  ");
                j--;
            }
            t=a-i;
            while(t>0) {
                p=a-t;
                System.out.print(p+" ");
                t--;
            }
            System.out.print(0+" ");
            t=a-i;
            int s=1;
            while(t>0) {
                System.out.print(a-s+" ");
                s++;
                t--;
            }
            i--;
            System.out.println();
        }
    }
}
