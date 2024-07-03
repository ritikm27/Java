import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] a={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(a,6)));
    }

    static int[] search(int[][] matrix, int target){
        int row=matrix.length;
        int col=matrix[0].length;

        if(row==1){
            return binarySearch(matrix, target, 0,0,col-1);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;

        while(rStart<(rEnd-1)){
            int rMid=rStart + (rEnd-rStart)/2;


            if(matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }

            else if(matrix[rMid][cMid] > target){
                rEnd=rMid;
            }
            else{
                rStart=rMid;
            }
        }

        //Now there left only two rows and as of I think the potential

        if(target== matrix[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        else if(target==matrix[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }

        // phase
        else if(target<=matrix[rStart][col-1]){
            return binarySearch(matrix, target, rStart,cMid,col-1);
        }
        else if(target<=matrix[rStart+1][cMid]){
            return binarySearch(matrix, target, rStart+1,0,cMid);
        }

        return new int[]{-1,-1};
    }





    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd){

        while(cStart<=cEnd){
            int mid=cStart + (cEnd-cStart)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }

            else if(matrix[row][mid]<target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }

        return new int[]{-1,-1};
    }
}
