package gz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] island = {{0, 1, 0, 0},
                          {1, 1, 1, 0},
                          {0, 1, 0, 0},
                          {1, 1, 0, 0}};
        System.out.println("Input grid:");
        printGrid(island);
        System.out.println("Result: " + islandPerimeter(island));
    }

    private static int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    if (i == 0 || grid[i - 1][j] == 0) count++;                      // up cell
                    if (j == 0 || grid[i][j - 1] == 0) count++;                      // left cell
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) count++;     // right cell
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) count++;        // down cell
                }
            }
        }
        return count;
    }

    private static void printGrid(int[][] grid) {
        for (int[] ints : grid) {
            Arrays.stream(ints).mapToObj(anInt -> anInt + " ").forEach(System.out::print);
            System.out.println();
        }
    }

}
