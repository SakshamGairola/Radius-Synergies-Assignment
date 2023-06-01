package com.getUser.getUserAPI.OtherSolutions;


public class SudokuSolution {

    public static void main(String[] args) {
        int[][] sudoku = new int[][]{{3, 0, 6, 5, 0, 8, 4, 0, 0}, {5, 2, 0, 0, 0, 0, 0, 0, 0}, {0, 8, 7, 0, 0, 0, 0,
                3, 1}, {0, 0, 3, 0, 1, 0, 0, 8, 0}, {9, 0, 0, 8, 6, 3, 0, 0, 5}, {0, 5, 0, 0, 9, 0, 6, 0, 0}, {1, 3,
                0, 0, 0, 0, 2, 5, 0}, {0, 0, 0, 0, 0, 0, 0, 7, 4}, {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        if (solveSudoku(sudoku, 0, 0)) {
            print(sudoku);
        }
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int num) {
        //condition for row and col
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[row][i] == num) {
                return false;
            }

            if (sudoku[i][col] == num) {
                return false;
            }
        }
        //now check for grid
        int gRow = (row / 3) * 3;
        int gCol = (col / 3) * 3;

        for (int i = gRow; i < gRow + 3; i++) {
            for (int j = gCol; j < gCol + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    } // check func

    public static boolean solveSudoku(int[][] sudoku, int row, int col) {
        if (row == sudoku.length) {
            return true;
        }
        int newRow;
        int newCol;
        if (col != sudoku.length-1) {
            newRow = row;
            newCol = col + 1;
        } else {
            newRow = row + 1;
            newCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, newRow, newCol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(sudoku, row, col, i)) {
                    sudoku[row][col] = i;
                    if (solveSudoku(sudoku, newRow, newCol)) {
                        return true;
                    } else {
                        sudoku[row][col] = 0;
                    }
                }
            }
        }
        return false;
    } //recursive func to solve sudoku

    public static void print(int[][] sudoku) {
        for (int[] ints : sudoku) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    } //print func
}
