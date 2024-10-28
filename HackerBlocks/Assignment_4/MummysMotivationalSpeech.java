package As4;
import java.util.*;
public class MummysMotivationalSpeech {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(checkLower(arr));
    }
    public static boolean checkLower(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr[0].length;j++){
                if(arr[i][j]==0){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;

    }
}
