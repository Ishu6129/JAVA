package GLA.pattern;

public class p_14 {
    public static void main(String[] arg){
        int a=5;
        int i=0;
        while (i<a){
            int j=0;
            while (j<(a-i-1)){
                System.out.print("  ");
                j++;
            }
            i++;
            int s=i;
            while(s>0){
                System.out.print("* ");
                s--;
            }
            System.out.println();
        }
        int k=0;
        while (k<a-1){
            int j=-1;
            while (j<k){
                System.out.print("  ");
                j++;
            }
            k++;
            int p=k;
            while(p<(a)){
                System.out.print("* ");
                p++;
            }
            System.out.println();
        }
    }

}
