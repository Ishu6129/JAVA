package GLA.pattern;

public class p_12 {
    public static void main(String[] arg){
        int n=5;
        int i=0;
        while (i<n){
            int k =(n-i)-1;
            while (k>0){
                System.out.print("  ");
                k--;
            }
            int j=0;
            while(j<i+1){
                j++;
                if (!(j<i+1))
                System.out.print("*  ");
                else
                System.out.print("* ! ");
            }
            i++;
            System.out.println();
        }
    }
}
