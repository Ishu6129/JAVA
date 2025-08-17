import java.util.Scanner;

public class Main {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        private Node root;
        private static int preIndex = 0;

        public BinaryTree(int[] pre, int[] in) {
            preIndex = 0;
            root = buildTree(pre, in, 0, in.length - 1);
        }

        private Node buildTree(int[] pre, int[] in, int start, int end) {
            if (start > end) return null;
            Node node = new Node(pre[preIndex++]);
            if (start == end) return node;
            int inIndex = findInorderIndex(in, start, end, node.data);
            node.left = buildTree(pre, in, start, inIndex - 1);
            node.right = buildTree(pre, in, inIndex + 1, end);
            return node;
        }

        private int findInorderIndex(int[] in, int start, int end, int val) {
            for (int i = start; i <= end; i++) {
                if (in[i] == val) return i;
            }
            return -1;
        }

        static class Info {
            int size;
            int min;
            int max;
            int largestBSTSize;
            boolean isBST;

            Info(int size, int min, int max, int largestBSTSize, boolean isBST) {
                this.size = size;
                this.min = min;
                this.max = max;
                this.largestBSTSize = largestBSTSize;
                this.isBST = isBST;
            }
        }

        public int largestBST() {
            return largestBSTUtil(root).largestBSTSize;
        }

        private Info largestBSTUtil(Node node) {
            if (node == null) {
                return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
            }

            Info left = largestBSTUtil(node.left);
            Info right = largestBSTUtil(node.right);

            if (left.isBST && right.isBST && node.data > left.max && node.data < right.min) {
                int size = left.size + right.size + 1;
                return new Info(size,
                        Math.min(left.min, node.data),
                        Math.max(right.max, node.data),
                        size,
                        true);
            } else {
                return new Info(0, 0, 0, Math.max(left.largestBSTSize, right.largestBSTSize), false);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] pre = new int[n];
        int[] in = new int[n];
        for (int i = 0; i < n; i++) pre[i] = scn.nextInt();
        for (int i = 0; i < n; i++) in[i] = scn.nextInt();

        BinaryTree bt = new BinaryTree(pre, in);
        System.out.println(bt.largestBST());
    }
}
