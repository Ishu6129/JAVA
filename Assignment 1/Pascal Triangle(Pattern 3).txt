import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            int coefficient = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coefficient + " ");
                coefficient = coefficient * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
