package GLA.Pattern;

public class p_17 {
    public static void main(String[] arg) {
        int n=7;
        int a=n/2;
        int i=0;
        while (i<a){
            int j=0;
            while (j<(a-i)){
                System.out.print("*  ");
                j++;
            }
            i++;
            int s=(2*i-1);
            while(s>0){
                System.out.print("   ");
                s--;
            }
            s=i;
            while(s<(a+1)){
                System.out.print("*  ");
                s++;
            }
            System.out.println();

        }
        int e=0;
        while (e<n){
            System.out.print("   ");
            e++;
        }
        System.out.println();
        i=0;
        while (i<a){
            int j=-1;
            while (j<i){
                System.out.print("*  ");
                j++;
            }
            i++;
            int s=2*(a-i)+1;
            while(0<s){
                System.out.print("   ");
                s--;
            }
            s=i;
            while(s>0){
                System.out.print("*  ");
                s--;
            }
            System.out.println();
        }
    }
}
