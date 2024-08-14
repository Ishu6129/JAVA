package GLA.Pattern;

public class p_31 {
    public static void main(String[] arg) {
        int n=5;
        int i1=n;
        int i2=0;
        int t=1;
        while (i1>0){
            i2=n;
            while(i2>0){
                if (t==i2){System.out.print("* ");
                }
                else{
                    System.out.print(i2+" ");;
                }
                i2--;
            }
            t++;
            i1--;
            System.out.println();
        }
    }
}
