package kr.or.bit;

//class == 설계도 == Type(사용자 정의 타입)

//사원이라는 설계도
//시나리오
//사원을 표현 (사번, 이름, 직종 .....)
public class Emp {
    
    //정보를 담을 수 있는 변수
    //사원은 사번을 가지고 있다 (사번은 숫자형태)
    //변수 > 정보 (고유, 상태, 부품) 담을 수 있는 공간의 이름 
    // >> instance variable(=member field = 객체변수)
    
    //변수의 종류(scope : 유효범위) : 선언되는 위치
    //1.   local variable (지역변수 : 함수 안)
    //     지역변수는 초기화를 하지않으면 쓸수없음
    //     class Person{public void run(){ int speed;}
    //1-1. block variable (함수안에 if블럭, for블럭 안에들어가는 변수)
    //2.   instance variable class Person{ public int age;}
    //3.   static variable : 공유자원(객체간)
    
    //클래스의 종류
    //1. class Test{ } >> 독자적인 실행이 불가능!
    //     >> 다른 클래스를 도와주는 클래스(타입) = lib
    //2. class Test{public static void main(String[] args{}}
    //     >> 독자적인 실행이 가능하다(왜? main()_이 있으니까)
    //2-1. >> 함수의 이름(main) >> 약속 >> 시작점(진입점)
    
    
    
    //Tip) c# >> Main() 대소문자만 다름!ㅋㅋㅋ
    
    //private = 캡슐화 : 자원을 보호 하겠다
    //직접할당을 막고 간접할당을 통해서 자원보호(데이터 제어)
    //멤버필드 앞에 private을 붙인다
    //함수를 만들어서 볼수있게함(setter,getter)
    private int empno;
    private String ename;
    private String job;
    
    
    public String getEname() {  //getter 함수
        return ename + "님";
    }
    public void setEname(String ename) {  //setter함수
        this.ename = ename;
    }

    private int num;
    // 함수 (최소의 기능(행위) 단위)
    // 간접 (누군가를 통해서 전달, 누군가를 통해서 받겠다)
    
    public void setNum(int n) { //setter 기능함수(write함수.쓰기전용)
    // 앞에 void가 있으면 나에게 돌려줄게 없다는뜻
        if(n > 0) {
            num = n;    
        }else {
            num = 0;
        }
        
    }
    public int getNum() { // getter 기능함수(read 함수.읽기전용)
        return num;
    }
    
    public int number;
    
    
    public void print() {
        int number = 0;
        // 지역변수
        System.out.println(number);
        for(int i = 0; i < 10; i++) {
            //여기서 i라는 변수가 block variable 
        }
       // System.out.println(i);
    }
    
    
}
