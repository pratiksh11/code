public class Shuffle {
    public static int[] shufflePr(int[] nums,int n){
        int[] arr=new int [2*n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[count]=nums[i];
            arr[count+1]=nums[i+n];
            count=+2;
        }
        return arr;
    }
    public static void main(String[] args){
     int [] nums={2,5,1,3,4,7};
     int n=3;
     int [] result=(shufflePr(nums,n));
     for (int num : result) {
        System.out.print(num + " ");
    }
     
    }
}
