/*
 OOP
 1. 상속
 2. 캡슐화
 3. 다형성
 
 1. 상속
 java : child extends Base
 c#   : child : Base
 
 2. 특징
 2-1 : 다중 상속은 불가
 2-2 : 단일상속 (계층적 상속 : 여러개의 클래스 상속 가능)
 2-3 : 다중 상속을 지원 (단 interface)
 
 3. 상속
 3-1. 진정한 의미 : 재사용성
 3-2. 단점 : 초기 설계 비용
 3-3. 재사용성 >> 설계 >> 비용 (공통분모(추상화))
 
 4. 상속관계
 GrandFather  >>  Father  >>  Child
 부모부터 heap에 올라간다. 
 Child child = new Child()
 
 
 
 
 */

//상속관계에서는 가장 상위 Base가 되는 클래스가
//Object를 상속
//class GrandFather extends Object 가 생략되어있는거임
class GrandFather{	//extends Object { 컴파일러가 알아서 처리
	public GrandFather() {
		System.out.println("GrandFather");
	}
	public int gmoney = 5000;
	private int pmoney = 1111; //접근자 private (객체, 상속관계) 접근 불가
	
	//(private pmoney) 이렇게 우회적인 접근은 되긴한다
	public void call() {
		System.out.println(pmoney);
	}
}

class Father extends GrandFather{
	public Father() {
		System.out.println("GrandFather");
	}
	public int fmoney = 3000;
}

class Child extends Father{
	public Child() {
		System.out.println("GrandFather");
	}
	public int cmoney = 1000;
}

//default
//사용자가 만드는 모든 클래스는
//눈에 보이지 않지만 class Car extends Object 라고 되어있는거임
class Car{
	
}

//사용자가 만드는 모든 클래스는 default Object(최상위) 클래스 상속
//Object 가장 추상화, 가장 일반화 ....
//가지는 자원 : 모든 클래스가 공통 사용하는 것들 ... 주소확인, 공통함수

public class Ex01_Inherit {

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
	
		
		Car car = new Car();
		
	}

}




















