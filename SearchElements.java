import java.util.*;

public class SearchElements{

    public static boolean Secrch(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==key){
                System.out.println("Found elements index :("+ i +"," + j +")");
                return true;
               }
            }
        }
        System.out.println("Not Found elements in array");
        return false;
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, Enter No. of rows: ");
        int rows = sc.nextInt(); 
        System.out.print("Please, Enter No. of columns: ");    
        int columns = sc.nextInt();
        //System.out.println("Please, Enter eleements of matrix.");
        int matrix[][] = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Please, Enter eleements of matrix ("+i+","+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("your matrix is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
               System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Please, Enter key eleements.");
        int key = sc.nextInt();
        Secrch(matrix,key);
    }
}