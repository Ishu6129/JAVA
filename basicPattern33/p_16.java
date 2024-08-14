package GLA.Pattern;

public class p_16 {
    public static void main(String[] arg) {
        int n=2;
        int i1=n;
        while(i1>0){
            int i2=1;
            while (i2<i1){
                System.out.print("  ");
                i2++;
            }
            int i3=0;
            while (i3<i1){
                System.out.print("* ");
                i3++;
            }
            System.out.println();
            i1--;
        }
        i1=2;
        while(i1<n+1){
            int i2=1;
            while (i2<i1){
                System.out.print("  ");
                i2++;
            }
            int i3=0;
            while (i3<i1){
                System.out.print("* ");
                i3++;
            }
            System.out.println();
            i1++;
        }
    }
}
