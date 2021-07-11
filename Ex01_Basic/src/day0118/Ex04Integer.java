package day0118;
//기본형 데이터타입01 - 정수형

//정수란?

//소수가 없는 온전한 숫자들

//대표적으로 자연수가 있다.

//프로그래밍에서는 정수형 기본 데이터타입으로 다음과 같이 4종류가 있다.

//1. byte

// 8비트. -2의 7승 ~ 2의 7승-1까지 (-128 ~ 127까지)

//2. short

// 16비트. -2의 15승 ~ 2의 15승-1까지 (-1.6만 ~ 1.6만까지)

//3. int

// 32비트. -2의 31승 ~ 2의 31승-1까지 (-20억 ~ 20억까지)

//4. long

// 64비트. -2의 63승 ~ 2의 63승-1까지



//컴퓨터에서는 가장 왼쪽 자리가 0이면 +, 1이면 -를 뜻한다.

//그렇다면 byte를 기준으로 해서

//+ 중에 가장 작은 숫자는?

//0000 0000 -> 0

//+ 중에 가장 큰 숫자는?

//0111 1111 -> 127

//- 중에 가장 작은 숫자는?

//1000 0000 -> -128

//- 중에 가장 큰 숫자는?

//1111 1111 -> -1



//데이터타입의 최대값보다 큰 값이 들어와서

//최소값으로 향하는 것을 우리는 overflow라고 한다.



//반대로 데이터타입의 최솟값보다 작은 값이 들어와서

//최대값으로 향하는 것을 우리는 underflow라고 한다.



//자바에서는 기본적으로 이러한 기본형 데이터타입들이 있지만

//코드 안의 숫자는 기본적으로 int 형으로 인식이 된다.



//즉, 여러분들이 정수형 데이터타입을 사용할 때 

//+- 20억의 범위 안이라면 int를 쓰고

//벗어나는 경우에는 long을 쓰면 된다!


public class Ex04Integer {

}
