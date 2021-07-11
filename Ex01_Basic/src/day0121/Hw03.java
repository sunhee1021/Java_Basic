package day0121;

import java.util.Scanner;
public class Hw03 {
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("번호 : ");
		int number = scanner.nextInt();
		
		System.out.print("이름 : ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.print("국어 : ");
		int korean = scanner.nextInt();
		
		System.out.print("영어 : ");
		int english = scanner.nextInt();
		
		System.out.print("수학 : ");
		int math = scanner.nextInt();
		
		
		while ((korean < 0) || (korean > 100)) {
			System.out.println("올바른 값이 아닙니다. 다시 입력해주세요.");
			System.out.print("국어 : ");
			korean = scanner.nextInt();
		}
	
		while ((english < 0) || (english > 100)) {
			System.out.println("올바른 값이 아닙니다. 다시 입력해주세요.");
			System.out.print("영어 : ");
			english = scanner.nextInt();
		}
		
		while ((math < 0) || (math > 100))  {
			System.out.println("올바른 값이 아닙니다. 다시 입력해주세요.");
			System.out.print("수학 : ");
			math = scanner.nextInt();
		}
		
		
		System.out.printf("번호: %03d번 ",number);
		System.out.printf("이름: %s\n",name);
		System.out.printf("국어: %03d점 ",korean);
		System.out.printf("영어: %03d점 ",english);
		System.out.printf("수학: %03d점\n",math);
		
		int sum = korean + english + math;
		double average = sum/3.0;
		
		System.out.printf("총점: %03d점 ",sum);
		System.out.printf("평균: %.2f점",average);
		
		scanner.close();
	}

}
