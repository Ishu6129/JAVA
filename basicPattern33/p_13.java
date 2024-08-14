package GLA.pattern;

public class p_13 {
    public static void main(String[] arg){
        int a=5;
        int i=0;
        while (i<a){
            int j=-1;
            while (j<i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
        int k=0;
        while (k<(a-1)){
            int j=0;
            while (j<(a-k-1)){
                System.out.print("* ");
                j++;
            }
            k++;
            System.out.println();
        }
    }
}
