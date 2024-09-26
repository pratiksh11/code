package Recrsion;

public class power {
    public static int optiPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq=optiPower(a,n/2)*optiPower(a, n/2);
        if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        int a=2;
        int n=10;
        System.out.println(optiPower(a, n));
    }
}
