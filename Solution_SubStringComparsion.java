import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution_SubStringComparsion {

	public static void main(String arg[]) {

		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		int k = scanner.nextInt();

		System.out.println("ans " + Solution_SubStringComparsion.getSmallestAndLargest(str, k));

	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int count = 0;

		for (int z = 0; z <= s.length() - k; z++) {
		//	System.out.println(z + " = " + s.substring(z, z + k));
			count++;
		}

	
		
		String[] array = new String[count];
		for(int i = 0; i <array.length; i ++) {
			array[i] = s.substring(i, i + k);
			//System.out.println(i + "= " + array[i] );
		}
		
		
		
		  for(int j = 0; j < array.length - 1; j++ ) {
			  for (int t = j +1; t < array.length; t ++) { 
				  if(array[j].compareTo(array[t]) > 0) { 
					  String str = array[j];
					  array[j] = array[t]; 
					  array[t] = str; } }

		  }
		  
		
	
		  smallest = array[0]; int index = array.length -1; largest = array[index];

		return smallest + "\n" + largest;
	}
}
