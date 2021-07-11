//System.out.println() 원리코드
class print{
	void add(int i) {System.out.println(i);};
	void add(String s) {System.out.println(s);};
}
class Ssystem{
	public static final print out; //out은 클래스area
	//out을 상수처리
	static { //static 초기자가 동작할때 print가 힙에 올라가는 거지
		out = new print();
	}//상수처리한 out을 초기화를 해야하니까
	//print만 쓰게 상수로 강제화
}

public class ETC_Println{
	public static void main(String[] args) {
		Ssystem.out.add(100);
	}//out 자체가 참조값을 갖고있음
}