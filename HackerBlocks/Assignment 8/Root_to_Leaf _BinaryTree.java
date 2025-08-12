import java.util.*;
public class Main {
	Scanner scn = new Scanner(System.in);
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    int size;

    public Main(int rootData, Main leftST, Main rightST) {
		this.root = new Node(rootData, null, null);
		this.root.left = (leftST != null) ? leftST.root : null;
		this.root.right = (rightST != null) ? rightST.root : null;

		this.size += (leftST != null) ? leftST.size : 0;
		this.size += (rightST != null) ? rightST.size : 0;
		this.size += 1;
	}


    public Main() {
        this.root = this.takeInput(scn, null, false);
    }

    private Node takeInput(Scanner scn, Node parent, boolean isLeft) {
        if (parent == null) {
            //System.out.println("Enter the data for root ");
        } else {
            if (isLeft) {
                //System.out.println("Enter the data for left child of " + parent.data);
            } else {
               // System.out.println("Enter the data for right child of " + parent.data);
            }
        }

        int cData = scn.nextInt();

        Node child = new Node(cData, null, null);
        this.size++;

        //System.out.println("Do you have a left child for " + child.data);
        boolean choice = scn.nextBoolean();

        if (choice) {
            child.left = this.takeInput(scn, child, true);
        }

       //  System.out.println("Do you have a right child for " + child.data);
        choice = scn.nextBoolean();

        if (choice) {
            child.right = this.takeInput(scn, child, false);
        }

        return child;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }

        String retVal = "";

        if (node.left != null) {
            retVal += node.left.data + " => ";
        } else {
            retVal += "END" + " => ";
        }

        retVal += node.data;

        if (node.right != null) {
            retVal += " <= " + node.right.data;
        } else {
            retVal += " <= " + "END";
        }

        retVal += "\n";

        retVal += this.toString(node.left);
        retVal += this.toString(node.right);

        return retVal;
    }
 	public void rootToLeaf(int k){
        printRootToLeaf(this.root,k,0,new ArrayList<Integer>());
    }

	public void printRootToLeaf(Node root,int targetSum,int sum,List<Integer> arr){
        if(root==null) return;
        sum+=root.data;
		arr.add(root.data);
        if(root.left==null && root.right==null) {
			if(sum==targetSum){
				for (int val : arr) {
					System.out.print(val + " ");
				}
			}
			return;
			}
        printRootToLeaf(root.left,targetSum,sum,arr);
        printRootToLeaf(root.right,targetSum,sum,arr);
        return;
    }

public static void main(String[] args) {

		Main b1= new Main();
		int k= b1.scn.nextInt();
		b1.rootToLeaf(k);
}
}
