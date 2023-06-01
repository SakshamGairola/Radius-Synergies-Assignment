package com.getUser.getUserAPI.OtherSolutions;

public class HourGlassSolution {

    public static void main(String[] args) {
        int[][] matrix = {
                            {1, 1, 2, 1},
                            {1, 1, 4, 1},
                            {5, 1, 2, 1},
                            {1, 3, 4, 1}
        };
        calcHourGlassSum(matrix);
    }

    public static void calcHourGlassSum(int[][] matrix) {

        int matrixRows = matrix.length;
        int matrixCols = matrix[0].length;
        if (matrixRows < 3 || matrixCols < 3) {
            System.out.println("No possible hour glass(es)");
        }else{
            for (int i = 0; i < matrixRows-2; i++) {
                for (int j = 0; j < matrixCols-2; j++) {
                    int sum  =  (
                            matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                                    + matrix[i+1][j+1]
                                    + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2]);
                    System.out.print(sum + "\t");
                }
                System.out.print("\n");
            }
        }
    }
}




