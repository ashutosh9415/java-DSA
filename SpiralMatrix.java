public class SpiralMatrix{

    public static void spiralMatrix(int matrix[][]){
        int start_Row = 0;
        int start_column = 0;
        int end_row = matrix.length-1;
        int end_column = matrix[0].length-1;
        while(start_Row<=end_row && start_column<=end_column){
            for(int i=start_column;i<=end_column;i++){
                System.out.print(matrix[start_Row][i]+" ");
            }
            for(int j=start_Row+1;j<=end_row;j++){
                System.out.print(matrix[j][end_column]+" ");
            }
            for(int i=end_column-1;i>=start_column;i--){
                if(start_Row==end_row){
                    break;
                }
                System.out.print(matrix[end_row][i]+" ");
            }
            for(int j=end_row-1;j>=start_Row+1;j--){
                if(start_column==end_column){
                    break;
                }
                System.out.print(matrix[j][start_column]+" ");
            }
            start_Row++;
            start_column++;
            end_row--;
            end_column--;
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(matrix);
    }
}