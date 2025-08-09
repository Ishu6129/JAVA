import java.util.*;
public class Main {
	static class Node{
		int data;
		Node left,right;
	}
	public Node createTree(int[] arr,int si,int ei){
        if(si>ei) return null;

        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.data=arr[mid];
        nn.left=createTree(arr,si,mid-1);
        nn.right=createTree(arr,mid+1,ei);
        return nn;
    }
   
	public Node lowestCommonAncestor(Node root, int p, int q) {
        if(root==null){
            return null;
        }
        if(root.data==p || root.data==q){
            return root;
        }

        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);
        if (left != null && right != null) {
            return root;
        }
        if(right==null){
            return left;
        }
        else{
            return right;
        }
    }
	 public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		Main t=new Main();
		Node root=t.createTree(arr,0,n-1);
		int p=sc.nextInt();
		int q=sc.nextInt();
		Node lca = t.lowestCommonAncestor(root, p, q);
        System.out.println(lca.data);  

    }
}
