package cheatsheet;
// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


public class MaxSum {
    public static void sumAr(int a[],int n){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            sum= sum+ a[i];
            // if(sum<0){
            //     sum=0;
            // }
            max=Math.max(sum,max);
        }
        System.out.println("Sum "+max);

    }
    public static void main(String args[]){
        int a[]={-8,-2,-3,-2,-5};
        int n=a.length;
        sumAr(a,n);
    }
}
