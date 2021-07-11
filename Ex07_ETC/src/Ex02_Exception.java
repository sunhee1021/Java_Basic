
public class Ex02_Exception {

	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		System.out.println("main Start");
		
		
		try {
			for(int i = 0; i < 10; i++) {
				result = num/(int)(Math.random()*10);
				System.out.println("result : " + result + "  i : " +i);
			}
		}catch(ArithmeticException e) {	//하위 예외(구체화,특수화) 좋아요(가독성)
			System.out.println("문제가 발생함 로그 기록하고 관리자에게 메일 발송");
			System.out.println("원인 : " + e.getMessage());
		}catch(NullPointerException e) { //부모타입
				
		}catch(Exception e) { //부모타입
			
			//하위 예외 먼저 선언 하고 상위 예외를 걸어야해
			//Exception 하고 ArithmeticException 을 걸면 에러나
			
			//ArithmeticException 아니고 NullPointerException 아닌
			//나머지 예외는 Exception 니가 다 해결해 라는 코드임
			
		}
	
		System.out.println("main end");
	}

}
