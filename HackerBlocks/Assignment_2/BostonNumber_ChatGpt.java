import java.util.Scanner;

public class Main {
    
    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static int primeFactorSum(int n) {
        int sum = 0;
        
        while (n % 2 == 0) {
            sum += sumOfDigits(2);
            n /= 2;
        }
        
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                sum += sumOfDigits(i);
                n /= i;
            }
        }
        
        
        if (n > 2) {
            sum += sumOfDigits(n);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digitSum = sumOfDigits(N);
        int primeFactorDigitSum = primeFactorSum(N);
        if (digitSum == primeFactorDigitSum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        
    }
}