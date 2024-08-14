package GLA.pattern;

public class p_3 {
    public static void main(String[] arg){
        int a=5;
        int i=0;
        while (i<a){
            int j=0;
            while (j<(a-i)){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
