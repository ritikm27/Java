import java.util.Arrays;

public class SortedRowColMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {10, 20, 30},
                {15, 25},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 34)));
    }

    static int[] search(int[][] matrix, int target){
        int row=0;
        int col=matrix[row].length-1;

        while(row<matrix.length && col>=0){

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if(matrix[row][col] < target){
                row++;
                // Note:- for matrix with varying number of columns in every row we
                // to add this operation also
                col=matrix[row].length-1;
            }
            else{  // if(matrix[row][col] >target)
                col--;
            }

        }

        return new int[]{-1,-1};
    }
}
