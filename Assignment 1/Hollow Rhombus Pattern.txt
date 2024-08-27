import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int space = 0;
        int star = 0;
        while (row < n) {
            space = n - row - 1;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }
            star = n;
            if (row == 0 || row == n - 1) {
                while (star > 0) {
                    System.out.print("*");
                    star--;
                }
            } else {
                while (star > 0) {
                    if (star > n - 1 || star <= 1) {
                        System.out.print("*");
                    } else {

                    System.out.print(" ");}
                    star--;
                }

            }
            System.out.println();
            row++;
        }

            
        }
    }
    
