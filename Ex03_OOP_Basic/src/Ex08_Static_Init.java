//static 변수   >> 모든 객체가 [같은 값]을 가지게 할거야
//instance 변수 >> 모든 객체가 [다른 값]을 가지게 할거야

class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 11;
	
	static { //static 블럭 (static 초기자 설정 블럭)
		cv = 10;	
		cv2 = cv+222;	//변형된(조작값) 값을 제공
		//member field에서 초기화 하나 여기서 초기화 하나 다른게 뭔가?
		//위에서는 변형된 값을 넣을수가 없음 (+222같은)
		//static 초기자는
		//static 멤버필드에 초기값을 주는걸 목적
		//static 멤버필드가 올라간 직후 발생	
	}
	
	{   //instance variable 초기화 블럭(int iv가 메모리에 올라가고 나서 발생)
		//new를 통해서 객체가 생성되고 int iv 변수가 메모리에 올라가고 나서 바로 호출
		//>> { }
		System.out.println("초기자 블럭");
		if(iv > 10) iv = 100; // = if(iv > 10){ iv = 100 }
	}
}

public class Ex08_Static_Init {
	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		
		//일반자원
		InitTest inittest = new InitTest();
		//이 한줄로 호출됨
		//instance variable 초기화 블럭
		
	}

}
