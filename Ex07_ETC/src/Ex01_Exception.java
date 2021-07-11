/*
오류
1. 에러(error)		: 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결불가
2. 예외(exception)	: 개발자의 코드 실수에 의해 발생 >> 방어적인 코드(예외처리)
>> 개발 ... 예외가 발생하면 ... 프로그램은 강제 종료 >> 비정상적인 종료

try{

	>>문제가 발생할 수 있는 코드
	>>문제가 발생하면 ... catch ...
	
}catch(Exception e){
	
	>>문제가 생기면 catch >> 문제를 파악
	>>처리 유도
	>>1. 관리자에게 email
	>>2. 로그파일에 문제를 기록
	>>3. 강제 종료는 막는다
	>> 개발자의 코드 수정이 필요하다.

}finally{

}
예외가 발생하면 개발자는 
예외 발생건에 대해서 파악하고 싶음(어떤자원에서?, 어떤 행동에 의해서?)

예외에 관련된 클래스 설계
예외가 발생하면
자동으로 예외에 맞는 클래스 객체를 생성
그리고 다양한 정보를 그 객체에 넣어줌



*/
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(0/0); // new ArithmeticException() -> java.lang.ArithmeticException	
		}catch(Exception e) { //Exception 클래스는 ArithmeticException의 부모타입
			//문제에 대한 파악
			
			e.printStackTrace();
			//문제 추적 코드
			System.out.println("발생 원인 :" +e.getMessage());	
		}
		
		System.out.println("main end");
	}

}
