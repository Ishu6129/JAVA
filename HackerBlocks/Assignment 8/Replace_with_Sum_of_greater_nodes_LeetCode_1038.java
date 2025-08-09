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

	public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

	public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

	static int sum = 0;
	public void setSum(Node root) {
		if (root == null) return;
        
        setSum(root.right);
        
        sum += root.data;
        root.data = sum;
        
        setSum(root.left);
    }

    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Main t=new Main();
		Node root=t.createTree(arr,0,n-1);
		// t.inorder(root);
		t.setSum(root);
		t.preorder(root);
    }
}
