package kr.or.bit;
/*
 	클래스 구성요소 (필드 + 함수)
 	
 	*기능(행위) 만드는 방법
 	*함수(function, method)
 	*method : 행위 또는 기능을 정의 (최소 단위) : 
 	>> 하나의 함수는 하나의 기능만 구현
 	ex) 먹는다, 잔다, 걷는다
 	*함수는 호출에 의해서만 동작(누군가 불러야해)
 	
 	JAVA)
 	1. void, parameter(0) >> void print(String str){ 실행코드 }
 	//너에게 돌려줄게 없지만 뭔가를 받을거야
 	2. void, parameter(X) >> void print(){실행코드}
 	//동전을 넣지 않아도 게임을 할수 있어
 	3. return type, parameter(0) >> int print(int data){return data + 10}
 	//동전을 넣으면 컵을 돌려줄거야 (당신이 준 값에 10을 더해서 돌려줄거야)
	4. return type, parameter(x) >> int print(){return 100;}
 	
 	void : 돌려주는 것이 없다 >> return value가 없다
 	return type >> 8가지 기본타입 가능, Array, class, collection, Interface
 	parameter type >> 8가지 기본타입 가능(return type과 같음)
 	
 	parameter 의 개수는 제한이 없다
 	void print(int a, int b, int c, int d){}
 	// 이 게임기가 돌아가려면 정수값4개를 넣어야 한다.
 	// 10원짜리 100원짜리 1000원짜리 50원짜리
 	// print(10,20,30) 3개만 넣으면 돌아가나? NO!
 	// print(10,20,30,40)_parameter와 같은개수를 넣어줘야한다
 	
 	ex)
 	boolean print(boolean b){return b};
 	print(false)
 	
 	관용적 표현
 	의미있는 단어의 조합
 	getChannelNumber()
 	getEmpListByEmpno()
 */
public class Fclass {
	public int data;
	
	//void m() >> 접근자 생략 (default void m()으로 봄)
	public void m() {
		System.out.println("일반함수 : void , parameter(X)");
		
	}
	
	public void m2(int i) {
		System.out.println("일반함수 : void , parameter(O)");
		System.out.println("parameter value : " + i);
		//i는 m2함수가 시작되면 생성되면 함수가 종료되면 사라진다
	}
	
	public int m3() {
		return 100; //return type이 존재하면 반드시 return 키워드를 사용해서 값을 돌려줘야한다.
	}
	
	public int m4(int data) {
		return 100+data;
	}
	//4가지 기본 유형
	
	//확장
	public int sum(int i, int j , int k) {
		return i + j + k;
	}
	
	
	//함수 (접근자 : 거의 public)
	//함수 접근자 private 인 경우가 있다
	//만든 설계자의 의도는 : 외부에서는 사용X
	//>> 내부에서만 사용해라 >> 다른 함수를 도와주는 역할
	//내부에서 사용되는 "공통함수"
	private int subSum(int i) {
		return i + 100;
	}
	
	public void callSubSum() {
		int result = subSum(100); //내부에서 호출
		System.out.println("call result: "+result);
	}
	
	private int operationMethod(int data) {
		return data * 200;
	}
	
	public boolean opSum(int data) {
		//연산은 다른 함수에게 맡기고
		//이 함수는 논리(진위)만 판단
		boolean bo;
		int result = operationMethod(data);
		if(result > 0) {
			bo = true;
		}else {
			bo = false;
		}
		return bo;
	}
	
	//Quiz
	//ex)  max(300,100) return 값은 300
	//public int max(int a, int b){}
	//return 은 !최소화! 하는게 좋음(여러번 쓸수 있지만 return a; retrun b;
	public int max(int a, int b) {
		int result;
		if(a > b) {
			result = a;
		}else {
			result = b;
		}
		
		return result;
	}
	/*90점
	 * int max = (a > b) ? a : b;
	 * return max
	 * 
	 * 
	 * 100점
	 * return (a > b) ? a : b;
	 */
	
	//함수의 return type or parameter  >> 8개 & Array,class(사용자 정의 타입)
	public Tv tCall() {	//Tv라는 타입을 갖는 [주소값: 같은 타입을 갖는 주소]를 리턴
		//return null; //난 Tv 타입의 객체가 없어라는 뜻(가능)
		//Tv t = new Tv(); //t라는 변수는 Tv타입 객체가 주소를 가지고 있다.
		//return t;
		//위 코드는 개발자가 어떤생각으로 만들었을까?
		//밑에 코드가 더 편한데?
		//세팅을해서 보낼수 있음 t.brandname = "LG"; 이렇게
		//객체에 어떤 값들을 세팅해서 보낼때
		
		return new Tv(); //Tv라는 객체의 주소값을 바로 리턴
		//어떠한 초기화도 없이 주소만 던지는 경우
	}
	
	public void tCall2(Tv tv) { //Tv 타입을 갖는 주소값을 parameter
		System.out.println("t 주소 값 : " + tv);
	}
}

	











