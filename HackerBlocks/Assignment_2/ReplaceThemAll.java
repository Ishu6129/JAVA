import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner  sc=new Scanner(System.in);
        String n=sc.next();
        for (int i=0;i<n.length();i++){
            if (n.charAt(i)=="0".charAt(0)){
                System.out.print("5");
            }
            else{
                System.out.print(n.charAt(i));
            }
        }
    }
}