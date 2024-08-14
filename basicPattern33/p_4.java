package GLA.pattern;

public class p_4 {
    public static void main(String[] arg){
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
            s=i;
            while(s>0){
                System.out.print("* ");
                s--;
            }
            System.out.println();
        }
    }
}

