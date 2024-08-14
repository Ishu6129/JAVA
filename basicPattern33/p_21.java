package GLA.Pattern;

public class p_21 {
    public static void main(String[] arg) {
        int n = 4;
        int i1=1;
        while(i1<n+1){
            int i2=0;
            while (i2<i1){
            System.out.print("*  ");
            i2++;
            }
            i1++;
            int i3=2*(n-i1)+1;
            boolean f=false;
            while (i3>0){
                System.out.print("   ");
                f=true;
                i3--;
            }
            int i4=i1-2;
            while (i4>0){
                System.out.print("*  ");
                i4--;
            }
            if (f){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
