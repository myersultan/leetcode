package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L119 {
    public static void main(String[] args) {
        System.out.println(getRow(3));

    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowIdx = 1; rowIdx <= rowIndex; rowIdx ++) {

            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowIdx-1);

            row.add(1);

            for (int i = 1; i < rowIdx; i ++) {
                row.add(prevRow.get(i-1) + prevRow.get(i));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}
