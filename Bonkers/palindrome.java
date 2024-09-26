public class palindrome {
    public static boolean funcPali(String str){
         int n=str.length();
        for(int i=0;i<n/2;i++){
           
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }
    public static float getPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
            //east
            else{
                x++;

            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(funcPali(str));
        String path="WNEENESENNN";
        System.out.println(getPath(path));
    }
    
}
