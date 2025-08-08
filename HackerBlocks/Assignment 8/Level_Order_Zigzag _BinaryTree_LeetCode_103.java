import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			boolean order=true;
            Queue<Node> q = new LinkedList<>();
            if (this.root != null) {
                q.add(this.root);
            }
            
            while (!q.isEmpty()) {
                int lsize = q.size();
                ArrayList<Integer> arr = new ArrayList<>();
                
                int count = 0;
                while (count < lsize) {
                    Node n = q.poll();
                    arr.add(n.data);
                    if (n.left != null) {
                        q.add(n.left);
                    }
                    if (n.right != null) {
                        q.add(n.right);
                    }
                    count++;
                }
				if(order){
					for(int i=0;i<arr.size();i++){
						System.out.print(arr.get(i)+" ");
					}
				}
				else{
					for(int i=arr.size()-1;i>=0;i--){
						System.out.print(arr.get(i)+" ");
					}
				}
				order=!order;
            }
		}
	}

}
