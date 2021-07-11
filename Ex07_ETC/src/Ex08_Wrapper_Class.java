import java.util.ArrayList;

/*
자바가 가지는 8가지 기본 타입(값 타입) : JAVA API 제공

8가지 기본 타입에 대해 설계도를 생성 >> 8가지 기본타입도 객체 형태로 사용 가능 >> wrapper class

값 타입 대신에 객체형태의 타입을 쓰는곳 >> generic (참조형태의 parameter만 가능)
1. 매개변수로 객체 타입이 요구될때
2. 기본형 값이 아닌 객체형태로 저장되길 원할때
3. 객체간 값 비교
4. 타입 변환시 비교

 */
public class Ex08_Wrapper_Class {

    public static void main(String[] args) {
        int i = 100;
        
        Integer n = new Integer(100); // is deprecated = 추후 버전에서 사라진다는 소리
        System.out.println(n); //사실은 n = 주소값이 나와야함 , 
        //(값이 나오는 이유integer가 toString으로 재정의했다)
        System.out.println(n.MAX_VALUE);
        System.out.println(n.MIN_VALUE);
        
        //POINT
        //Integer -> 함수의 parameter
        //제너릭 -> 값타입을 못쓰고 객체타입만 올수 있게 되어있음
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(100);
        //li.add("A"); -> 타입이 강제되어있기때문에 컴파일도 안됨
        for(int value : li) {
            System.out.println(value);
        }
        
        //char -> Character
        //int -> Interger
        //나머지는 앞글자 대문자 ex.boolean -> Boolean
    }

}
