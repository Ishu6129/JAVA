package GLA.pattern;

public class p_6 {
    public static void main(String[] arg) {
        int n=5;
        int i=n;
        while (i>0){
            int k=n-i;
            while (k<3*(n-i)){
                System.out.print("  ");
                k++;
            }
            int j=0;
            while (j<i){

                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

    }
}
