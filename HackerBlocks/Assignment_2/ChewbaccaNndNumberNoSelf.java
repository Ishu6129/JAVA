import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();         
        long result = 0;
        long place = 1; 
        while (x > 0) {
            long digit = x % 10;
            long invertedDigit = 9 - digit;
        
            if (x / 10 == 0 && invertedDigit == 0) {
                result = result + digit * place; 
            } else {               
                if (invertedDigit < digit) {
                    result = result + invertedDigit * place;
                } else {
                    result = result + digit * place;
                }
            }

            x = x / 10; 
            place *= 10; 
        }

        System.out.println(result);  // Print the resulting minimum number
    }
}
