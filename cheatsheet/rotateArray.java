package cheatsheet;

public class rotateArray {
    public static void funcArr(int a[],int n){
        int c= a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
           
        }
         a[0]=c;
    }
    
    public static void main(String args[]){
    int a[]={1, 2, 3, 4, 5};
    int n=a.length;
    funcArr(a, n);
    
    System.out.println("Rotated array");
    for(int i=0;i<n;i++){
        System.out.println(a[i]+" ");
    }

    }
    
}
