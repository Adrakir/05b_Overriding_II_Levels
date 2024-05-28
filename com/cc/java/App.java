package com.cc.java;

public class PacMan {
    private static int pacX = 1; // Pac-Mans Startposition
    private static int pacY = 1;
    private static int score = 0;

    public static void main(String[] args) {
        char[][] maze = { 
            {'#', '#', '#', '#', '#'},
            {'#', '.', '.', '.', '#'},
            {'#', '.', '#', '.', '#'},
            {'#', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#'}
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMaze(maze);
            System.out.println("Score: " + score);

            System.out.print("Bewegung (w, a, s, d): ");
            String move = scanner.nextLine();

            if (move.equals("w") && maze[pacY - 1][pacX] != '#') pacY--;
            if (move.equals("s") && maze[pacY + 1][pacX] != '#') pacY++;
            if (move.equals("a") && maze[pacY][pacX - 1] != '#') pacX--;
            if (move.equals("d") && maze[pacY][pacX + 1] != '#') pacX++;

            if (maze[pacY][pacX] == '.') {
                score++;
                maze[pacY][pacX] = ' ';
            }
        }
    }

    private static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
