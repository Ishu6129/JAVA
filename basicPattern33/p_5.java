package GLA.pattern;

public class p_5 {
    public static void main(String[] arg){
    int a=5;
    int i=0;
    int s=0;
    while (i<a){
        int j=-1;
        while (j<i-1){
            System.out.print("  ");
            j++;
        }
        i++;
        s=i;
        while(s<(a+1)){
        System.out.print(" *");
        s++;
    }
        System.out.println();
    }
}
}