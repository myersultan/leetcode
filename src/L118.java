import java.util.ArrayList;
import java.util.List;

public class L118 {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);
        triangle.forEach(x -> x.forEach(System.out::print));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int numRow = 1; numRow < numRows; numRow++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(numRow - 1);

            row.add(1);

            for (int i = 1; i < numRow; i++) {
                row.add(prevRow.get(i-1) + prevRow.get(i));
            }

            row.add(1);

            triangle.add(row);
        }


        return triangle;
    }
}
