package cheatsheet;

public class reverse1 {
    public static void reverse(int[] a){
        System.out.println("Array in reverse in order");
       for(int i=a.length-1;i>=0;i--) {
           System.out.println(a[i]+"");
        }
    
    }
    public static void main(String args[]){
       int[] a=new int[]{2,4,6,7};
       reverse(a);
    }
}
