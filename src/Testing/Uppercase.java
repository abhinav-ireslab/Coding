package Testing;

public class Uppercase {
  
	     public static void main(String[] args)
	     {
	         String str= "my name is khan";        // string
	         String[] words =str.split("\\s");      // split each words of above string
	         String C = "";         // create an empty string

	         for(String w:words)
	         {  
	              String first = w.substring(0,1);    // get first character of each word
	              String f_after = w.substring(1);    // get remaining character of corresponding word
	              C += first.toUpperCase() + f_after+ " ";  // capitalize first character and add the remaining to the empty string and continue
	         }
	         System.out.println(C);    // print the result
	     }
	}
	

