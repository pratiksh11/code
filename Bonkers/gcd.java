public class gcd {
    public static void main(String[] s){
        int a=10;
        int b = 3;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print(a);
    }
}
