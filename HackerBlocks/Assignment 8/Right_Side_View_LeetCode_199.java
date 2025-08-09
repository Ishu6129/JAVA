import java.util.*;
public class Main {
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    private static Node root;
    public static Node createTree(){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Node node=new Node(e);
        root=node;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node rv=q.poll();
            int c1=sc.nextInt();
            if(c1!=-1){
                Node nn=new Node(c1);
                rv.left=nn;
                q.add(nn);
            }
            int c2=sc.nextInt();
            if(c2!=-1){
                Node nn=new Node(c2);
                rv.right=nn;
                q.add(nn);
            }
        }
        return root;
    }
    public static void main (String args[]) {
        Node t=createTree();
        List<Integer> l=new ArrayList<>();
        rightside(t,1,l);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
    static int mxd=0;
    public static void rightside(Node root,int cl,List<Integer> l){
        if(root==null){
            return;
        }
        if(mxd<cl){
            l.add(root.val);
            mxd=cl;
        }
        rightside(root.right,cl+1,l);
        rightside(root.left,cl+1,l);
    }
}
