import kr.or.bit.Singleton;

public class Ex14_Singletone_main {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		System.out.println(s); //kr.or.bit.Singleton@15db9742
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s); //kr.or.bit.Singleton@15db9742
	}

}
