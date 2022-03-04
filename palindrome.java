import java.util.*;   
class palindrome  
{  
   public static void main(String args[])  
   {  
      String first, reverse = "";
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      first = sc.nextLine();   
      int length = first.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + first.charAt(i);  
      if (first.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  