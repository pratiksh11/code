import java.util.*;

// public class largest {
//     public static int getLargest(int[] numbers) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
        
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
        
//         System.out.println("Smallest value is: " + smallest);
//         return largest;
//     }
    
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 6, 3, 5};
//         int largestValue = getLargest(numbers);
//         System.out.println("Largest value is: " + largestValue);
//     }
// }
public class largest{
    public static void subarray(int numbers[]){
    int ts=0;
    for(int i=0;i<numbers.length;i++){
    int start=i;
    for(int j=i;j<numbers.length;j++){
        int end=j;
        for(int k=start;k<=end;k++){
            System.out.print(numbers[k]+"");
        }
        ts++;
        System.out.println();
    }
    System.out.println();
   }
   System.out.println("total subarray="+ts);
  }
    public static void main(String args[]){
        int numbers[]={2,4,5,6};
        subarray(numbers);
    }

}
