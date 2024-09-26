public class assesn {
    // public static int fnumber(int a[][]){
    // int count=0;
    // for(int i=0;i<a.length;i++){
    //     for(int j=0;j<a[0].length;j++){
    //      if(a[i][j]==7){
    //         count++;
    //      }
    //     }
    // }
    // return count;
    // }
    // public static int main(String args[]){
    //     int a[][]={{4,7,8}
    //               ,{8,8,7}};
    // int counts = fnumber(a);
    // System.out.println("Number of 7's in the array: " + counts);
    // }
    // public static int rowSum(int a[][]){
    //     int sum=0;
    //     for(int j=0;j<a[0].length;j++){
    //         sum+=a[1][j];
    //     }
    //     return sum;
    // }
    // public static void main(String args[]){
    //     int a[][]={ {1,4,9},
    //     {11,4,3},
    //     {2,2,3} };
    //     int ok=rowSum(a);
    //     System.out.println("the sum is:"+ok);
    // }
    public static void transose(int a[][]) {
  
    int row=a.length;
    int column=a[0].length;
    int transPoseMatrix[][]=new int[column][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
        transPoseMatrix[j][i]=a[i][j];
        }
    }
    for(int i=0;i<column;i++){
        for(int j=0;j<row;j++){
        System.out.print(transPoseMatrix[i][j]);
        }
        System.out.println();
    }

    
   }
    public static void main(String args[]){
        int a[][]={{11,12,13},
                     {21,22,23}};
        transose(a);
        

    }

}
