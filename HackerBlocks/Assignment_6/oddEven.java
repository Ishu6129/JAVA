package Assignment_6;
import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        odd_desc(n);
        even_asc(n);
    }
    public static void odd_desc(int n){
        if(n<=0){
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }
        odd_desc(n-1);
    }
    public static void even_asc(int n){
        if(n<=0){
            return;
        }
        even_asc(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
}

//5
//        
//5
//3
//1
//2
//4