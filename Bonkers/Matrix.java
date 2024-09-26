// public class Matrix{
//     public static void spiralMadi(int matrix[][]){
//         int startRow=0;
//         int startCol=0;
//         int endRow=matrix.length-1;
//         int endCol=matrix[0].length-1;
//         while(startRow<=endRow && startCol<=endCol){
//             //top
//             for(int j=startCol;j<=endCol;j++){
//                 System.out.println(matrix[startRow][j]+" ");
//             }
//             //right
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.println(matrix[i][endCol]+" ");
//             }
//             //bottom
//             for(int j=endCol-1;j<=startCol+1;j--){
//                if(startCol==endCol){
//                 return;
//                }
//                 System.out.println(matrix[startCol][j]+" ");
//             }
//             //left
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startCol==endCol){
//                 return;
//                }
//                 System.out.println(matrix[i][startRow]+"");
//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow++;
        
        
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},
//                          {5,6,7,8},
//                          {9,10,11,12},
//                          {13,14,15,16}};
//     }
//     spiralMadi(matrix);


// }
public class Matrix {
    public static void spiralMadi(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;
            
            // Right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;
            
            // Bottom
            if (startRow <= endRow) { // Check if there are rows left to print
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }
            
            // Left
            if (startCol <= endCol) { // Check if there are columns left to print
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        
        spiralMadi(matrix);
    }
}
