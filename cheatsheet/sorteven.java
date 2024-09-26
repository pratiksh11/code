package cheatsheet;

public class sorteven {
    public static void main(String[] k){
        int a[]={7,6,4,3,1,2,8};
        for(int i =0;i<a.length;i++){
            while(a[i]%2!=0)i++;
            for(int j=i+1;j<a.length;j++){
                while(a[j]%2!=0)j++;
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i =0;i<a.length;i++)System.out.print(a[i]);
    }
}
