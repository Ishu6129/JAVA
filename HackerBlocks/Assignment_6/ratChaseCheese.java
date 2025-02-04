package Assignment_6;
import java.util.*;
public class ratChasesCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        print(maze, 0, 0, ans);
        if (val == false) {
            System.out.println("NO PATH FOUND");
        }

    }

    static boolean val = false;

    public static void print(char[][] maze, int cr, int cc, int[][] ans) {
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }
        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            ans[cr][cc] = 1;
            val = true;
            display(ans);
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        print(maze, cr - 1, cc, ans);
        print(maze, cr, cc - 1, ans);
        print(maze, cr + 1, cc, ans);
        print(maze, cr, cc + 1, ans);
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;

    }

    public static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}

//5 4
//OXOO
//OOOX
//XOXO
//XOOX
//XXOO
//
//1 0 0 0
//1 1 0 0
//0 1 0 0
//0 1 1 0
//0 0 1 1 