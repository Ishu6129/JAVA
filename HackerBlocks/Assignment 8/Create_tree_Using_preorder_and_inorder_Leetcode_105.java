import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int n = scn.nextInt();
		int[] pre = takeInput(n);
		int[] in = takeInput(n);
		BinaryTree bt = m.new BinaryTree(pre, in);
	}

	public static int[] takeInput(int n) {
		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
			Queue<Node> q=new LinkedList<>();
			q.add(this.root);
			while(!q.isEmpty()){
				Node n=q.poll();
				System.out.print(n.data+" ");
				if(n.left!=null){
					q.add(n.left);
				}
				if(n.right!=null){
					q.add(n.right);
				}
			}
		}

		private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if(ilo>ihi || plo>phi) return null;
			Node node=new Node();
			node.data=pre[plo];
			int idx=search(in,ilo,ihi,pre[plo]);
			int c=idx-ilo;
			node.left=construct(pre,plo+1,plo+c,in,ilo,idx-1);
			node.right=construct(pre,plo+c+1,phi,in,idx+1,ihi);
			return node;
		}

		public int search(int[] in,int ilo,int ihi,int item){
			for(int i=ilo;i<=ihi;i++){
				if(in[i]==item){
					return i;
				}
			}
			throw new RuntimeException("Element " + item +" "+Arrays.toString(in));
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
