package cheatsheet;
import java.util.*;

public class maxAndMin {
     public static void maxy(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        int max=arr[arr.length-1];
        System.out.println("Min "+min);
        System.out.println("Max "+max);
     }
    public static void main(String[] args){
        int[] arr={5,3,8,9};
        maxy(arr);
    }
}
