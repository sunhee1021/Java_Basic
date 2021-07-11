package kr.or.bit;
//디자인 패턴 (생성 패턴) >> new (객체)
//객체를 하나 만들어서 공유 (static과는 다른 개념)
//설계도 자체가 하나밖에 못만들게 되어 있음
//의도 : 하나의 객체를 공유하겠다

//활용
//공유프린터
//공유 와이파이


//JDBC 에서 활용예제 할께요 ^^
//디비연동할때
public class Singleton {
	private static Singleton p;
	//new를 못쓰니까 static으로 해야해
	private Singleton() {
		//생성자인데 평소보던거랑 달라
		//private이 붙었네? private으로 생성자를 감췄어, 왜?
		//직접 객체 생성 불가 (직접 객체생성을 못하게(new못하게=(heap에 객체 생성 불가)))
		
		
	}
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton();	//생성자 호출 객체 만든것
		}
		return p;
	}
}
