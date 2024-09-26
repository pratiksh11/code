package cheatsheet;
import java.util.*;

public class negative {
    public static void negSort(int[] a){
     Arrays.sort(a);
     System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        int[] a={-12,11,-13,-5,-8,10,12};
        negSort(a);
    }
    
}
