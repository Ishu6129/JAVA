package GLA.Pattern;

public class p_27 {
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
        s=i;
        int t=s+1;
        int r=0;
        while(s>0){
            r=t-s;
            System.out.print(r);
            System.out.print(" ");
            s--;
        }
        while(r-1>0){
            System.out.print(r-1);
            System.out.print(" ");
            r--;
        }
        System.out.println();
    }
}
}
