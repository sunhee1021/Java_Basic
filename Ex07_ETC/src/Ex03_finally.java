import java.io.IOException;

/*
게임 CD >> pc에 설치하려고함
>> 1. 설치파일 > C:\Temp 복사
>> 2. 그 복사한 파일 >> 돌리면 게임설치가 됌
>> 3. 정상설치 > C:\Temp 에 복사한 파일 삭제
>> 4. 비정상(설치중 문제가생기면 = 강제종료 생기면) >> 그 복사한 파일 삭제
>>    정상적이던 비정상적이던 '그 복사한 파일 삭제를(강제화)'하고 싶으면 

 */
public class Ex03_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}

	public static void main(String[] args) {
		//3개의 함수가 정상 
		//예외를 사용자가 필요에 따라서 강제 할수있음
		//실제로는 예외가 아니지만
		//개발자가 어떠한 상황에 대해서 강제로 예외 지칭 가능
		//1이면 정상, 2이면 강제로 에외를 발생해서 catch!
		//throw new IOException()
		
		try {
			copyFiles();
			startInstall();
			//throw new IOException("install 도중 문제가 발생"); //개발자가 임의로 발생시킨것
		}catch(Exception e) {
			System.out.println("예외 메시지 출력 : " +e.getMessage());
		
		}finally {	//예외가 발생하던 발생하지 않던 무조건 실행되는 블럭
			fileDelete();
			//이 메소드(fileDelete())가 예외메시지 출력 밑으로 들어가면
			//예외가 발생하지 않았을때 파일삭제가 진행이 안되는거야
			//함수의 경우 강제 종료가 가능(return 을 만나면)
			//그런데 예외적으로 finally에서는
			//return에 의해서 종료되기 전에 호출이 됨
		}
		
		//그래서 이위치에 써도 문제없지 않아?
		//라는 말이 함수 강제종료의 상황일때 맞지 않음
		
		System.out.println("main end");
		

	}

}
