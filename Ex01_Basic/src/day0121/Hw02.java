package day0121;

import java.util.Scanner;
public class Hw02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		
		while((0 > score) || (100 < score)) {
			System.out.println("올바른 값이 아닙니다. 다시 입력해주세요.");
			System.out.print("점수를 입력해주세요 : ");
			score = scanner.nextInt();
		}
		
		if(score >=0 && score <= 100) {
		
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
		
		
		scanner.close();
	 }

  }
