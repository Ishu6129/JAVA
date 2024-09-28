import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int nr=sc.nextInt();
            int nc=sc.nextInt();
            int[] rick=new int[nr];
            int[] cab=new int[nc];
            int rick_s=0;
            int cab_s=0;
            for (int i=0;i<nr;i++){
                rick[i]=sc.nextInt();
                rick_s+=Math.min((rick[i]*c1),c2);
            }
            rick_s=Math.min(rick_s,c3);
            for (int i=0;i<nc;i++){
                cab[i]=sc.nextInt();
                cab_s+=Math.min((cab[i]*c1),c2);
            }
            cab_s=Math.min(cab_s,c3);
            System.out.println(Math.min((rick_s+cab_s),c4));
            n--;
        }
    }
}