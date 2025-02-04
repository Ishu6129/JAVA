package Assignment_6;
import java.util.*;
public class ratInMaze_ashr {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] maze = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[N][N];

        if (maze[0][0] == 1) {
            findPaths(maze, 0, 0, "", paths, visited);
        }

        Collections.sort(paths);

        for (String path : paths) {
            System.out.print(path + " ");
        }
    }

    public static void findPaths(int[][] maze, int row, int col, String path, List<String> paths, boolean[][] visited) {
        int N = maze.length;
        if (row == N - 1 && col == N - 1) {
            paths.add(path);
            return;
        }

        visited[row][col] = true;

        // Down
        if (isValidMove(maze, row + 1, col, visited)) {
            findPaths(maze, row + 1, col, path + "D", paths, visited);
        }
        // Left
        if (isValidMove(maze, row, col - 1, visited)) {
            findPaths(maze, row, col - 1, path + "L", paths, visited);
        }
        // Right
        if (isValidMove(maze, row, col + 1, visited)) {
            findPaths(maze, row, col + 1, path + "R", paths, visited);
        }
        // Up
        if (isValidMove(maze, row - 1, col, visited)) {
            findPaths(maze, row - 1, col, path + "U", paths, visited);
        }

        visited[row][col] = false;
    }

    public static boolean isValidMove(int[][] maze, int row, int col, boolean[][] visited) {
        int N = maze.length;
        return row >= 0 && row < N && col >= 0 && col < N && maze[row][col] == 1 && !visited[row][col];
    }
    
}
