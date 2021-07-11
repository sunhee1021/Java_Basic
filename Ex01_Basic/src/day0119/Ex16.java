package day0119;

import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("생년을 입력해주세요.");
		int year = scanner.nextInt();
		
		System.out.println("생월을 입력해주세요.");
		int month = scanner.nextInt();
		
		System.out.println("생일을 입력해주세요.");
		int date = scanner.nextInt();
		
		System.out.println("생년 : " + year +"년");
		System.out.println("생월 : " + month +"월");
		System.out.println("생일 : " + date +"일");
		
		
		System.out.println("주민등록번호 :" + year + month + date);
		
		
		
		
		scanner.close();
	}

}
