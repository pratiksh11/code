public class compare {
    public static void main(String args[]){
        String str="aaabbbcc";
        System.out.println(compress(str));

    }
    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;//later we will add in char 
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
             count++;
             i++;
            }
             newStr += str.charAt(i);
             if(count > 1){
                newStr += count.toString();
             }
            
        }
        return newStr;
    }
}
