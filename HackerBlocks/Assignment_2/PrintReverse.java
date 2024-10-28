import java.util.*;

public class Main {
    public static int reverseNumber(int n) {
        int reversedNum = 0;
        while (n > 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int reversedNum = reverseNumber(n);
        System.out.println(reversedNum);
    }
}
