import java.util.Scanner;

public class Main {
    public static int findLCM(int n1, int n2) {
        int maxNum = Math.max(n1, n2);

        while (true) {
            if (maxNum % n1 == 0 && maxNum % n2 == 0) {
                return maxNum;
            }
            maxNum++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();
        int lcm = findLCM(n1, n2);
        System.out.println(lcm);
    }
}
