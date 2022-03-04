import java.util.ArrayList;  
  
public class removemethod {  
   public static void main(String[] args) {  
      ArrayList<String> arr = new ArrayList<String>(5);   
      arr.add("c");  
      arr.add("c++");  
      arr.add("java");  
      arr.add("python");  
      System.out.println("The list of the size is: " + arr.size());    
      for (String name : arr) {  
         System.out.println("Name of program is: " + name);  
      }      
      arr.remove(1);  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
      for (String name : arr) {  
         System.out.println("Name of program is: " + name);  
      }  
   }  
}  