public class reversestring  
{    
    public static void main(String[] args)
     {    
        String string = "Tathastu";        
        String reversedString = "";        
        for(int i = string.length()-1; i >= 0; i--){    
            reversedString = reversedString + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);        
        System.out.println("Reverse of given string: " + reversedString);    
    }    
}    