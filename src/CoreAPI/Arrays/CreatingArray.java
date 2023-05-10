package CoreAPI.Arrays;

import java.util.Arrays;

public class CreatingArray {
    public static void main(String[] args) {
        // First way to create an array
        int[] arr = new int[4];

        // Second way to create an array in java
        int[] sec = new int[]{1, 2, 3, 4, 45};

        // third way to create an array
        int[] thi = {2, 3, 3, 4};


        // Multidimensional array
        int[][] differentSizes = {
                {1, 4},
                {3},
                {9, 8, 7}
        };

        for (int[] i : differentSizes) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println();


        int[][][] pl = threeArray(1, 3, 3);

        print3D(pl);
    }

    static int[][][] threeArray(int arr, int rows, int cols) {
        int[][][] res   = new int[arr][rows][cols];
        int       count = 1;
        for (int i = 0; i < arr; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    res[i][j][k] = count++;
                }
            }
        }
        return res;
    }

    static void print3D(int[][][] a) {
        for (int i = 0; i < 1; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print("[");
                for (int k = 0; k < 3; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.print("]");
            }
            System.out.print("]");
        }
    }
}
