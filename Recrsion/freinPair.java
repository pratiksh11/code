

public class freinPair {
    public static int friendPairs(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=friendPairs(n-1);
        //pair
        int fnm2=friendPairs(n-2);
        int pairWays=(n-1)*fnm2;
        //toWays
        int totWays=fnm1+pairWays;
        return totWays;
    }
    public static void main(String[] args){
        int n = 3;
        int ways = friendPairs(n);
        System.out.println("Number of ways to pair up " + n + " friends: " + ways);
    }
}
