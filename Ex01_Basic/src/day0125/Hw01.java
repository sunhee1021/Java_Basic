package day0125;

import java.util.Scanner;
import java.util.Random;
public class Hw01 {
    static final int MAX = 3;
    static final int SISSOR = 1;
    static final int ROCK = 2;
    static final int PAPER = 3;
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		
		int comNum = 0;
		int score = 0;
		
		
		System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)");
		System.out.print("> ");
		int userChoice = scanner.nextInt();
		
		while(userChoice <= 0 || userChoice > MAX ) {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)");
			System.out.print("> ");
			userChoice = scanner.nextInt();
			
			
				if(userChoice == SISSOR) {
				// 사용자의 이번 점수를 저장할 int 변수 선언
				int currentScore = 1;
				int computerNumber = random.nextInt(MAX) + 1;
				
				/*여기부터 에러
				 * if(userChoice-computerNumber = -1 || userChoice-computerNumber = 2) {
				 
						System.out.printf("사용자: %s",);
					}else{
						System.out.println("UP");
					}
                    System.out.print("숫자를 입력하세요 : ");
                    userNumber = scanner.nextInt();
                    currentScore ++;
                    
                }
				currentScore ++;   
				
				}else if(userChoice == ROCK) {
				*/
				//출력
					
					
					
				}else if(userChoice == PAPER) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
				}
	
	
		scanner.close();
	}
	
		}
}
	
