package GLA.pattern;

public class p_11 {
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
                System.out.print("*   ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
