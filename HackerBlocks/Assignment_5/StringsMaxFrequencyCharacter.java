package Assignment_5;
import java.util.*;
public class StringsMaxFrequencyCharacter {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n = s.length();
        int e=1;
        char v=s.charAt(0);
        for(int i=1;i<n;i++){
            if (v==s.charAt(i)){
                e++;
            }
            else{
                if (e>1){
                    e--;
                }
                else{
                    v=s.charAt(i);
                    e=1;
                }
            }
        }
        System.out.print(v);
    }
}
