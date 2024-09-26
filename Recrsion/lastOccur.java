package Recrsion;


public class lastOccur {
    public static int lastOccure(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        int isFound=lastOccure(arr,key,i+1);
        if(isFound==-1&& arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String args[]){
        // int arr[]={5,5,5,5};
        // System.out.println(lastOccure(arr,5,0));
        System.out.println(power(2,10));
    }
}
