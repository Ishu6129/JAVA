package GLA.pattern;

public class p_2 {
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
    }
}
