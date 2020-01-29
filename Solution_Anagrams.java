import java.util.Arrays;

public class Solution_Anagrams {
	
	
	 static boolean isAnagram(String a, String b) {
		 
		 boolean isStatus = false;
		 a  = a.replace("\\s", "");
		 b = b.replace("\\s",""); 
		 if(a.length() != b.length()) {
			 isStatus = false;
		 }else {
			 
			 char[] aArray = a.toLowerCase().toCharArray();
			 char [] bArray = b.toLowerCase().toCharArray();
			 
			 
			
			 
			 String aArr = new Solution_Anagrams().sortChar(aArray);
			 System.out.print("\n");
			 String bArr = new Solution_Anagrams().sortChar(bArray);
			 
			 System.out.println(aArr);
			 System.out.println(bArr);
			 
			
			  if(aArr.equals(bArr)) {
				 isStatus = true;
			 }else {
				 isStatus = false;
			 }
			 
			
			 
		 }
		 
		
		return isStatus;
	        // Complete the function
	    }
	 
	 String sortChar(char[] array){
		 
		for(int i =0; i < array.length - 1; i ++) {
			
			for(int k = i + 1; k < array.length; k ++ ) {
				if(array[i] > array[k]) {
					
					char temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
			
		}
		
		String str = "";
		for(int i = 0; i < array.length; i ++)
		{
			System.out.println(array[i]);
			
			  char c = array[i]; 
			  str = str + String.valueOf(c);
			  
			 
			
		}
	
		
		//System.out.println(str);
		return str;
	 }
	 
	 
	public static void main(String arg[]) {
	
			if(isAnagram("anagram", "margana")) {
				System.out.println("Anagrams");
			}else {
				
				System.out.println("Not Anagrams");
			}
	}

}
