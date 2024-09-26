public class duplicate {
    
    public int removeDuplicates(int[] nums) {
        int[] a=new int[nums.length];
        int i=0,j=0;
        while(i<nums.length&&j<a.length){
            a[j]=nums[i];
            if(i==nums.length-1)break;
            while(nums[i]==nums[i+1])i++;
            i++;
            j++;
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        for(i=0;i<a.length;i++){
            nums[i]=a[i];
        }
        int c=1;
        for( i =0;i<a.length;i++){
            if(a[i+1]<a[i])break;
            else c++;
        }
        return c;

    }
    public static void main(String[] args){
        int nums[]={0,0,0,1,1,1,2};
        duplicate d= new duplicate();
        System.out.print(d.removeDuplicates(nums));
    }
    
}
