package GLA.Pattern;

public class p_23 {
    public static void main(String[] arg) {
        int a=5;
        int i=0;
        int s=0;
        while (i<a){
            int j=0;
            while (j<(a-i-1)){
                System.out.print("  ");
                j++;
            }
            i++;
            s=(2*i)-1;
            while(s>0){
                System.out.print("1 ");
                s--;
            }
            System.out.println();
        }
    }
}
