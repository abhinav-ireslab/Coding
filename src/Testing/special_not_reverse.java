package Testing;

public class special_not_reverse {
	
	
    public static void reverse(char str[]) 
    { 
        // Initialize left and right pointers 
        int r = str.length - 1, l = 0; 
        char tmp;
        
        // Traverse string from both ends until 
        // 'l' and 'r' 
        while (l < r) 
        { 
            // Ignore special characters 
            if (!Character.isAlphabetic(str[l]) && (!Character.isDigit(str[l]))) 
                l++; 
            else if(!Character.isAlphabetic(str[r]) && (!Character.isDigit(str[r]))) 
                r--; 
  
            // Both str[l] and str[r] are not spacial 
            else 
            { 
                tmp = str[l]; 
                str[l] = str[r]; 
                str[r] = tmp; 
                l++; 
                r--; 
            } 
        } 
    } 
    
       
    

	public static void main(String[] args)  
    { 
        String str = "a!!!2b.c.d,e'f,ghi"; 
        char[] charArray = str.toCharArray(); 
  
        System.out.println("Input string: " + str); 
        reverse(charArray);
        String revStr = new String(charArray); 
  
        System.out.println("Output string: " + revStr); 
    }

} 
