package GLA.pattern;

public class p_7 {
    public static void main(String[] arg) {
        int a = 5;
        int i1 = 1;
        while (i1 < a+1) {
            int i2=1;
            while (i2<a+1){
                if (i1==a || i2==a || i1==1 || i2==1)
                    System.out.print("* ");
                else System.out.print("  ");
                i2++;
            }
            i1++;
            System.out.println();
        }
    }
}