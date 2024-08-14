package GLA.pattern;

public class p_15 {
    public static void main(String[] arg) {
        int n = 5;
        int i = n;
        while (i > 0) {
            int k = n - i;
            while (k+1 < 3 * (n - i)+1) {
                System.out.print("  ");
                k++;
            }
            int j = 0;
            while (j < i) {

                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
        i = n;
        while (i-1>0) {
            int k = i;
            while (k < (3 * (i-1))-1) {
                System.out.print("  ");
                k++;
            }
            int j=0;
            while (j<(n-i+2)){
                System.out.print("* ");
                j++;
            }
            i--;
            System.out.println();

        }
    }
}
