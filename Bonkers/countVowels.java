import java.util.Scanner;
public class countVowels {
    public static int vowels(String input){
        int count=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'||ch=='u'){
                count++;
            }
           
        }
        return count;
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
         String input=sc.nextLine();
         int vowelCount = vowels(input);
         System.out.println("vowels count " +vowelCount);
    }
    
}
