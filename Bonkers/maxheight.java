import java.util.*;
public class maxheight {
    int height(int arr[],int n,int k){

        Arrays.sort(arr);
            int ans[]=new int[n];
            int res=arr[n-1]-arr[0];
            int large=arr[n-1]-k;
            int small=arr[0]+k;
            int flag=0,i=0;
            while(i+1<n){
                if(arr[i]+k>arr[i+1]-k){

                    ans[i]=arr[i]+k;
                }
                i++;
            }
            while(i!=n){
                ans[i]=arr[i]-k;
                i++;
            }
            int max=0;
            int min=100001;
            for(int j=0;j<n;j++){
                min=Math.min(min,arr[j]);
                max=Math.max(max,arr[j]);
            }
            return max-min;
    }
    public static void main(String[] args){
        maxheight m=new maxheight();
        int[] arr={1,5,8,10};
        System.out.print(m.height(arr, 4, 2));
    }
    
}
