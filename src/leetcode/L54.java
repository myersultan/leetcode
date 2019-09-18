package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L54 {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = spiralOrder(input);
        list.forEach(System.out::print);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int last_row = matrix.length - 1;
        int last_col = matrix[0].length - 1;

        List<Integer> res = new ArrayList<>();

        int row = 0, col = 0;

        while(row <= last_row && col <= last_col) {
            for (int i = col; i <= last_col; i++) {
                res.add(matrix[row][i]);
            } row++;

            for (int i = row; i <= last_row; i++) {
                res.add(matrix[i][last_col]);
            } last_col--;

            if(row <= last_row) {
                for (int i = last_col; i >= col ; i--) {
                    res.add(matrix[last_row][i]);
                } last_row --;
            }

            if(col <= last_col) {
                for (int i = last_row; i >= row ; i--) {
                    res.add(matrix[i][col]);
                } col++;
            }
        }

        return res;

    }
}
