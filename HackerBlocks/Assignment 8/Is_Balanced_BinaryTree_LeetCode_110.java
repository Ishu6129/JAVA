import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {
            if(node==null){
                BalancedPair sb=new BalancedPair();
                sb.height=-1;
                sb.isBalanced=true;
                return sb;
            }
            BalancedPair lbp=isBalanced(node.left);
            BalancedPair rbp=isBalanced(node.right);
            BalancedPair sbp=new BalancedPair();
            sbp.height=Math.max(lbp.height,rbp.height)+1;
            sbp.isBalanced=Math.abs(lbp.height-rbp.height)<=1;
            return sbp;

		}

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

	}
}
