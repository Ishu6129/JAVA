import java.util.*;
public class Main {
	class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
	public void treeLot(){
        createTree();
    }
    private void createTree(){
        Scanner sc=new Scanner(System.in);
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        nn.val=sc.nextInt();
        root=nn;
        q.add(nn);
        while(!q.isEmpty()){
            Node r=q.poll();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node node=new Node();
                node.val=c1;
                r.left=node;
                q.add(node);
            }
            if(c2!=-1){
                Node node=new Node();
                node.val=c2;
                r.right=node;
                q.add(node);
            }
        }
    }
	public Node getRoot() {
        return root;
    }
	public static void main(String args[]) {
		Main t  = new Main();
		t.treeLot();
		Node rootref = t.getRoot();

		Queue<Node> q=new LinkedList<>();
        q.add(rootref);
        while(!q.isEmpty()){
            Node n=q.poll();
			if(n.left==null && n.right==null){
				System.out.print(n.val+" ");	
			}
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
    }
}
