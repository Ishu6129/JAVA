import java.util.*;
public class whereIsBishop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ls=new int[2];
        int j=0;
        int loop=0;
        int rp=0;
        while(n>0){
            ls[0]=0;
            ls[1]=0;
            j=0;
            loop=0;
            int row=0;
            Boolean f=false;
            while(loop<8){
                String v=sc.next();
                for(int i =0;i<v.length();i++){
                    if(v.charAt(i)=='#'){
                        ls[j]=i+1;
                        j++;
                    }
                }
                j=0;
                if(((ls[1]-ls[0])==1) && !f){
                    rp=++ls[0];
                    f=true;
                    row=loop;
                }
                loop++;
            }
            System.out.println(row+1+" "+(rp-1));
            f=false;
            n--;
        }
        sc.close();
    }
}
