public class pdtsum {
    public static void main(String[] args){
        int pdt=1,sum=0,n=234;
        while(n!=0){
            pdt=pdt*n%10;
            sum=sum+n%10;
            n=n/10;

        }
        System.out.print(pdt-sum);
    }
}
