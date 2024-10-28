package As4;
import java.util.*;
public class PiyushAndMagicalPark {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int S=sc.nextInt();
        String[][] arr = new String[N][M];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.next();
            }
        }
        for(int i=0;i<arr.length;i++){
            S=move(arr[i],S);
            if (S < K) {
                System.out.println("No");
                return;
            }

        }
        if(S>K){
            System.out.println("Yes");
            System.out.println(S);
        }
        else{
            System.out.println("No");
        }
    }
    public static int move(String[] arr,int S){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(".")){
                if(!(i==arr.length-1)){
                    S=S-3;
                }
                else{
                    S=S-2;
                }
            }
            else if(arr[i].equals("*")){
                if(!(i==arr.length-1)){
                    S=S+4;
                }
                else{
                    S=S+5;
                }
            }
            else{
                return S;
            }
        }
        return S;
    }

}
