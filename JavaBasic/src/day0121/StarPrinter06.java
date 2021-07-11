package day0121;

import java.util.Scanner;
public class StarPrinter06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****별찍기 6번*****");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		for(int i = 1; i <= userNumber; i++) {
			
			String stars = new String();
			
			//공백을 담당하는 j for 문
			for(int j = 1; j <= i-1; j++) {
				stars += " ";
			}
			//별을 담당하는 j for문
			for(int j = 1; j <= ((userNumber-i)*2)-1; j++) {
				stars += "*";
			}
		System.out.println(stars);
		
		/*
		System.out.println("*****별찍기 5번*****");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		for(int i = userNumber; i >= 1; i--) {
		String stars = new String();
		
            // 공백을 담당하는 j for문		
			for(int j = 1; j <= userNumber-i; j++) {
				stars += " ";
			}
			
			
			// 별을 담당하는 j for문
			for(int j = 1; j <= (i*2)-1; j++) {
				stars += "*";
			} 
			*/
		
		}
		scanner.close();
	}
}
