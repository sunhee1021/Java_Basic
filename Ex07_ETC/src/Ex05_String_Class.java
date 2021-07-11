/*
String >> 클래스 > new를 통해서 사용가능 > 일반적인 값타입처럼 사용해도 문제없다
String이 가지고 있는 수 많은 함수 (문자열 .. 조작하는 것이(합치고 자르고 붙이고)
String 가지는 다양한 함수 활용 (static 함수 + 일반함수)
최소 15개 ~ 20개 암기 (삶이 편해진다)


 */


public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = "";
		System.out.println(">" + str + "<");
		//사용방법 : int, double 와 같이 사용
		
		String[] strarr = {"aaa", "bbb", "ccc"};
		for(String s : strarr) {
			System.out.println(s);
			}
		///////////////////////////////////////////지금까지
		String str2 = "홍길동";
		System.out.println(str2.length());
		System.out.println(str2.toString());  //Object >> toString() 재정의
		System.out.println(str2); //toString() 생략
		
		String str3 = new String("김유신");
		
		//1. String name = "가나다라마";
		//String 클래스의 내부적으로 저장되는 자료구조 char[] >> [가][나][다][라][마]
		//class String extends Object(char[] value ... toString()... length())
		
		String str4 = "AAA";
		String str5 = "AAA";
		System.out.println(str4);
		System.out.println(str5.toString());
		System.out.println(str4 == str5);
		//== 연산자는 값을 비교하는 연산자 (str4(주소값), str5(주소값))
		//같은 주소
		//주소가 아니라 가지고 있는 값을 비교 (문자열)
		//String 비교에 (==) 쓰는사람 바보
		//왜?
		System.out.println(str4.equals(str5));

		
		String str6 = new String("BBB");
		String str7 = new String("BBB");
		System.out.println(str6 == str7); //false
		//String 만들때 new 사용하면 강제적으로 메모리 할당
		System.out.println(str6.equals(str7));
		
		//문자열비교는 equals 사용
		
		//넌센스
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);
		s = "A";
		//이경우에는 위에것을 재사용
		//String 1000개의 문자를 누적해라?
		//위에처럼 하면 바보 (1000개를 다만드는거임)
		
		//누적데이터를 쓰려면
		//StringBuffer
		//StringBuilder 를 써야해
		//for문 돌리면서 하면 바보멍청이야
	
	}

}




















