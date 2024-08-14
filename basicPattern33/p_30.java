package GLA.Pattern;

public class p_30 {
    public static void main(String[] arg) {
        int n=5;
        int i1=n;
        int i2=0;
        while (i1>0){
            i2=n;
            while(i2>0){
                System.out.print(i2+" ");
                i2--;
            }
            i1--;
            System.out.println();
        }
    }
}
