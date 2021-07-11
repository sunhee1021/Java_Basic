package day0121;

import java.util.Scanner;
public class StarPrinter10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****별찍기 10번*****");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		//위
		for (int i = 1; i <= userNumber; i++)
	    {
	    	String stars = new String();
	    	for(int j = i; j<=userNumber; j++) {
					stars += "*";
				}
	 
	        for(int j = 1; j <= i-1; j++) {
					stars += " ";
				}
	     
	        for(int j = 1; j <= i-1; j++) {
					stars += " ";
				}
				
			for(int j = i; j <= userNumber; j++) {
					stars += "*";
				}
	    
		System.out.println(stars);
	    }
	 
	    //아래
	    for (int i = 1; i <= userNumber; i++)
	    {
	        String stars = new String();
	        for (int j = 0; j <= i; j++)
	        {
	        	stars += "*";
	        }
	        for (int j = 1; j >= userNumber-i; j--)
	        {
	        	stars += " ";
	        }
	 
	        for(int j = 1; j <= userNumber-i; j++) {
				stars += " ";
			}
			
			for(int j = 0; j >= i; j++) {
				
				stars += "*";
			}
	 
	    System.out.println(stars);
		
		}
		scanner.close();
	
}
}