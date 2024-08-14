package GLA.Pattern;

public class p_32 {
    public static void main(String[] arg){
     int a=5;
     int i=1;
     int i2=0;
     while (i<a+1){
         i2=i;
         while (i2>0){
             System.out.print(i+" ");
             if (i>1 && i2-1>0){
                 System.out.print("* ");
             }
             i2--;
         }
         i++;
         System.out.println();
     }
     i=a-1;
     while (i>0){
        i2=i;
        while (i2>0){
            System.out.print(i+" ");
            if (i>1 && i2-1>0){
                System.out.print("* ");
            }
            i2--;
        }
        i--;
        System.out.println();
     }

    }
}
