package day0119;
// 자바의 콘솔화면에 출력하는 3가지 방법
// 1. print()
//    print()는 괄호안의 내용을 출력하고 그 다음 출력할 것이 있으면
//    print()가 출력한 내용 바로 다음 칸부터 출력을 시작한다.

// 2. println()
//    println()은 print a line의 줄임말 - 줄단위 출력
//    println()은 괄호안의 내용을 출력하고 그 다음 출력할 것이 있으면
//    그 다음줄 첫번째 칸부터 출력이 시작한다.

// 3. printf()
//    printf 는 print in format의 줄임말로써
//    괄호안의 내용을 형식에 맞추어 출력하고 그 다음 출력할 것이 있으면
//    printf()가 출력한 내용 바로 다음 칸부터 출력을 시작한다.

// 4. 공백문자
//    공백문자란, \+ 알파벳으로 이루어진 "한개"의 문자이다.
//    엔터키, 탭 공백 등의 공백문자가 있으며
//    엔터키는 \n, 탭 공백은 \t 등으로 표시한다.


public class Ex11Print {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("DEF");
		//String의 정석적인 표현
		//String str1 = "abc"보다는 위처럼 표현
		
		//1. print()를 체험해보자
		System.out.print(str1);
		System.out.print(str2);
		
		//2. println()을 체험해보자
		System.out.println(str1);
		System.out.println(str2);
		
		//3. printf()를 체험해보자
		System.out.printf(str1);
		System.out.printf(str2);
		
		//4. 공백문자를 체험해보자
		System.out.println();
		System.out.print(str1+'\n');
		System.out.print(str1+"\t"+str2);
		// \n 엔터를 의미하는 ''하나'의 문자'기 때문에 ''로 가능
		// \t 탭을 의미하는 것은 쌍따옴표 그냥따옴표 둘다 가능
	}
}
