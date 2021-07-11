package day0125;

import java.util.Random;
import java.util.Scanner;
public class Hw1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int comNum = 0;
		int userNum = 0;
		int win = 0;
		int lose = 0;
		int compare = 0;
		
		while(true) {
		System.out.println("가위바위보 중 하나를 선택해주세요.(가위: 1 바위: 2 보: 3)");
		System.out.print("> ");
		int userNumber = scanner.nextInt();
		
		if(userNumber <= 0 || userNumber > 3) {
			System.out.println("잘못입력하셨습니다.");
		}else if(userNumber == 1) {
			System.out.println("사용자: 가위");
			
		}else if(userNumber == 2) {
			System.out.println("사용자: 바위");
			
		}else if(userNumber == 3) {
			System.out.println("사용자: 보");
			
		}
		while(true) {
			System.out.println("1.플레이 2.현재 전적 보기 3.종료");
			System.out.print("> ");
			int userChoice = scanner.nextInt();
			
			if(userChoice == 1) {
				//플레이구현
				System.out.println("가위바위보 중 하나를 선택해주세요.(가위: 1 바위: 2 보: 3)");
				System.out.print("> ");
				userNumber = scanner.nextInt();
				
			}else if(userChoice == 2) {
				//현재 전적 보기
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
			
		}
		
		
		scanner.close();
	}
	}
}
