import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int sz=sc.nextInt();
			Set<Integer> set=new HashSet<>();
			for(int i=0;i<sz;i++){
				set.add(sc.nextInt());
			}
			int chk_len=sc.nextInt();
			for(int i=0;i<chk_len;i++){
				int num=sc.nextInt();
				System.out.println(set.contains(num)?"Yes":"No");
			}
		}
    }
}
