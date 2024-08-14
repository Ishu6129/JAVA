package GLA.pattern;

public class p_8 {
    public static void main(String[] arg) {
        int n = 5;
        int i=1;
        while ( i < n + 1) {
            int j=1;
            while (j < n + 1) {
                if (i == j || i + j == 6)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
