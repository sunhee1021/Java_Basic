import java.io.IOException;

import kr.or.bit.MyClass;

public class Ex04_ExClass {

	public static void main(String[] args) {
		try {
			MyClass my = new MyClass("C:\\Temp");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
