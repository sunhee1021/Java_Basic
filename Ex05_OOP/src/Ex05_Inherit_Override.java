import kr.or.bit.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}

class Test3 extends Test2{
	int x = 300;	//c# 부모 무시하기	//이런식의 코드는 쓰지마세요
					//문법적인 오류는 없지만 의미가 없다
	@Override
	void print() {
		System.out.println("자식이 부모함수를 재정의");
	}
	
	//이건 overloading(오버로딩)이야 헷갈리면 안돼
	void print(String str) {
		System.out.println("나 오버로딩이야 " + str);
	}
}


public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		
		t3.print();
		t3.print("hello");
		
		//////////////////////////////////////////
		Emp emp = new Emp(1000,"홍길동");
		System.out.println(emp);	//조작된 주소 : kr.or.bit.Emp@15db9742
		System.out.println(emp.toString()); //kr.or.bit.Emp@15db9742
		//emp라고 출력하면 사실은 toString()이 뒤에 숨어있는거임
		
		
	}

}
