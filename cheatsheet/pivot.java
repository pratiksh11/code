package cheatsheet;

public class pivot {
    public static void main(String args[]) {
        pivot p = new pivot();
        p.pivotInteger(8);

    }
        public void pivotInteger(int n) {
            int i,j,suma=0, sumb=0;
            for(i=1;i<=n;i++)
            {
                suma+=i;
                sumb=0;
                for(j=n;j>=1;j--)
                {
                    sumb+=j;
                    if(suma==sumb&&i==j)
                    System.out.println(j);
                }
    
            }
            System.out.println(-1);
            
        }
    
    
}
