package day0125;
// 컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를
// 사용자가 몇번만에 맞추는지 기록하는
// 숫자맞추기 게임
// 조건1. 무한로프를 사용해서
//       사용자가 1을 누르면 게임시작
//       2를 누르면 최고점수 보기
//       3을 누르면 게임 종료가 될수 있도록
//       프로그램을 작성하시오
//       단 최고 점수는 가장 적은 횟수로 컴퓨터의 숫자를 맞춘 횟수가 최고점수가 됩니다.

// 힌트1. 최고점수는 어떻게 기록해야할까?
//       최고점수는 맨 처음 플레이하면 어떤게 최고점수가 될까?
// 힌트2. random.nextInt(최대값)을 입력하면
//       0부터 최대값-1 까지의 값이 랜덤하게 나온다.
//       그렇다면 어떻게 해야 1~최대값의 범위가 나오도록
//       만들수 있을까?
//       random.nextInt(10) -> 0,1,2,3,4,5,6,7,8,9
//       random.nextInt(10) + 1 -> 1,2,3,4,5,6,7,8,9,10
import java.util.Random;
import java.util.Scanner;
public class Ex04GuessingGame {
	static final int MAX = 100;
	public static void main(String []args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		//최고기록을 저장할 int 변수(값이 while문안에서 초기화가 되버리면 안되니까)
		int bestScore = 0;


		while(true) {
            System.out.println("1.게임시작 2.최고점수 보기 3.게임종료");
            System.out.print("-> ");
            int userChoice = scanner.nextInt();
            
            
			if(userChoice == 1) {
				// 게임시작 코드 구현
				
				// 사용자의 이번 점수를 저장할 int 변수 선언
				int currentScore = 1;
				
				System.out.print("숫자를 입력하세요 : ");
				int userNumber = scanner.nextInt();
				
				// random을 사용하여 1~100사이의 난수 생성
				int computerNumber = random.nextInt(MAX) + 1;
				
				while(userNumber != computerNumber) {
					if(userNumber > computerNumber) {
						System.out.println("DOWN");
					}else{
						System.out.println("UP");
					}
                    System.out.print("숫자를 입력하세요 : ");
                    userNumber = scanner.nextInt();
                    currentScore ++;
                    
                }
				System.out.println("정답!!!!!!!!!!!!!!!!!");
				System.out.println("이번 게임의 점수는 "+currentScore+"입니다.");
				// 최고기록을 확인하여 필요하다면
				// 현재점수로 최고기록을 바꿔준다.
				// 최고기록을 현재기록으로 바꿔주는건 2가지 경우이다.
				// 1. 처음 플레이했을때
				// 2. 최고기록이 현재기록보다 클때
				// bestScore가 0일때!(currentScore는 1로 초기화해놨기때문에X)
				/*if(bestScore == 0) {
					bestScore = currentScore;
				}else if(bestScore > currentScore);{
					bestScore = currentScore;
				}
				bestScore = currentScore 가 같으니까 논리연산자로 한번에!↓
				*/
				if(bestScore == 0 || bestScore > currentScore) {
					bestScore = currentScore;
				}
				
			}else if(userChoice == 2) {
				// 최고기록 보기 코드 구현
				if(bestScore == 0) {
					// 아직 플레이 기록이 없으므로 경고 메시지만 출력
					System.out.println("아직 게임기록이 없습니다.");
				}else {
					System.out.println("현재 최고기록: "+bestScore);
				}
				
				
			}else if(userChoice == 3) {
				System.out.println("게임을 종료합니다. 감사합니다.");
				break;
			}
		}
		
		scanner.close();
	}
	
	
}
