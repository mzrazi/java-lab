import java.util.*;


public class SortStrings{
	public static void main(String[] args){
			Scanner sc= new Scanner (System.in);
			
		System.out.println("Enter the  first string");
		String firstString=sc.nextLine();
		
		System.out.println("Enter the second string");
		String SecondString=sc.nextLine();
		
		
		char[] firstChars= firstString.toCharArray();
		Arrays.sort(firstChars);
		String sortedFirstString= new String(firstChars);
		
		char[] secondChars= SecondString.toCharArray();
		Arrays.sort(secondChars);
		String sortedSecondString= new String(secondChars);
		
	System.out.println("sorted first string :" +sortedFirstString);
	System.out.println("sorted first string :" +sortedSecondString);
	
	
	
	                                   }
	          	}
	
		
		
		
		
		
		
		
