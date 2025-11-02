public class SumOfDiagonal {

    public static int DiagonalSum(int matrix[][]) {

        // int sum = 0;
        // for(int i=0;i<matrix.length;i++){ 
        //     for(int j=0;j<matrix[0].length;j++){ 
        //         if(i == j){ sum += matrix[i][j];     // TC = 0(n^2)
        //         }
        //          else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum; 


        int sum = 0;
        int n = matrix.length;   // TC = 0(n)

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            if (i != n - 1 - i) { // avoid double-counting center in odd-sized matrix
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }
        
    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int result = DiagonalSum(matrix);
        System.out.println("Sum of diagonals = " + result);
    }
}
