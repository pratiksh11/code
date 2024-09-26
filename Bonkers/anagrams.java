import java.util.*;
public class anagrams {
    public static boolean og(String str1,String str2){
       if(str1.length()!=str2.length()){
           return false;
       }
       else{
           char[] s1=str1.toCharArray();
           char[] s2=str2.toCharArray();
           Arrays.sort(s1);
           
           Arrays.sort(s2);
           return Arrays.equals(s1,s2);

       }
    }
    public static void main(String[] args){
      String str1="race";
      String str2="caru";
      anagrams a=new anagrams();
      System.out.print(a.og(str1,str2));

        
    }
   
}
