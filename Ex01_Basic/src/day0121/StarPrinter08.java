package day0121;

import java.util.Scanner;
public class StarPrinter08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*****별찍기 8번*****");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		//윗부분을 담당하는 for문
		for(int i = 1; i <= userNumber-1; i++) {
			String stars = new String();
			
			// 공백은 위한 j for문
			for(int j = 1; j <= userNumber-i; j++) {
				stars += " ";
			}
			
			// 별을 위한 j for문
			for(int j = 1; j <= i; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		//아랫부분을 담당하는 for문
		for(int i = 1; i <= userNumber; i++) {
			String stars = new String();
			
			for(int j = 1; j <= i-1; j++) {
				stars += " ";
			}
			
			for(int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			
			
			System.out.println(stars);
		}
		
		
	scanner.close();


}
}
