/*
User 사용자 : Provider 제공자

class A{}
class B{}

관계) A는 B를 사용합니다

사용방법
1. 상속  A extends B
2. 포함  A 라는 클래스는 B를 member field(멤버필드)로 가질수 있다
   -> class A {B b;}
   2-1. 부분집합
   2-2. 전체집합
   -----------------------------------------------------
   
  class B {}
  class A {
  	int i;
  	B b; // A는 B를 사용합니다(포함)
  	A(){
  		b = new B();
  	}
  }
  >> B라는 클래스는 독자적인 생성(x) >> A라는 객체가 만들어져야 B도 생성
  >> A a = new A() >> A객체도 생성되고 , B객체도 생성
  >> 같은 생명(생명주기가 같아요) >> 전체집합 (A가 죽으면 B도 죽어요)
  
  class B{}
  class A{ //A는 B를 사용합니다(포함) _ 위에꺼랑 뭐가 다르냐면!
  			//위에는 AB 두 객체의 생명 주기가 같았어(전체집합_자동차와 엔진) 컴포지션
  			//밑에는 두 객체가 별개지(부분집합_학교와 학생) 어그리게이션
  	int i;
  	B b;
  	A(){
  	
  	}
  	A(B b){
  	this.b = b;
  	}
  	
  }
  
   >>void main() //메인함수에서 돌려보면
   
   A a = new A();
   B b = new B();
   A a2 = new A(b); // 부분집합
   
   //A, B 같은 운명체가 아니다
   -----------------------------------------------------
   
   class B{}
   class A{
   	  int i;
   	  A(){
   	  }
   	  
   	  void m(B b) { // A는 B에 의존합니다(함수), **B타입의 member field 가 없어요
   	   b 객체를 가지고 작업
   	  
   	  }
   }
   
   void main()
   B b = new B();
   A a = new A();
   어떤 상황에는 B객체 필요
   a.m(b);
 
   

 */
class B{
	
}
class A{
	void method(B b) {
		
	}
}

//TODAY POINT
//현대적인 프로그램이 기법은 : 인터페이스 활용
interface Icallable{
	void m();
}

class D implements Icallable{ //전자제품 매장의 buy랑 똑 같 아

	@Override
	public void m() {
		System.out.println("D Icallable 인터페이스의 m()을 재정의");
	}
	
}

class F implements Icallable{

	@Override
	public void m() {
		System.out.println("F Icallable 인터페이스의 m()을 재정의");
	}
	
}

//interface POINT >> 유연하게 >> 확장자 >> 느슨한 관계
class User{
	
	void method(Icallable ic) {
		ic.m();
	/*void method(D d) {
		d.m();
	}
	void method(F f) {
		f.m();
	}*/
	}
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		a.method(b);	//여기는 반드시 B타입의 객체 주소가 와야함
						//B객체를 생성하지 않으면 method 사용불가
						//전자제품 매장 생각해보면 tv를 100개 만드는거랑 똑같은 코드인거임
		
		D d = new D();
		F f = new F();
		User user = new User();
		user.method(d);
	}

}












