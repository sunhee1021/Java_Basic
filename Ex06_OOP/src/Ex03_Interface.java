/*
추상클래스 : 인터페이스(interface)

인터페이스 : 표준, 약속, 규약, 규칙 을 만드는 행위

[추상 클래스 : 인터페이스 공통점]
1. 스스로 객체 생성 불가능( new 연산자를 통한 객체 생성 불가)
1-1. 차이점 : 추상 클래스(완성 + 미완성), 인터페이스(모든 것이 미완성 = 모든것이 추상자원)

2. 사용
추상클래스 : extends
인터페이스 : 반드시 구현해라 (implements 사용)
class Car extends abclass{}
          ↕ 
class Car implements la{} //인터페이스가 가지는 추상자원을 다 재정의 해라

추상클래스 인터페이스
1. 다중 상속 가능 (유일하게 인터페이스만 가능)
>> 약속(작은 단위로 여러개) >> 여러개의 작은 약속을 모아서 큰 약속을 만듬
class Test extends Object implements Ia, Ib, Ic
약속을 크게 만들면 >> 사용성이 떨어진다 >> 한정 >> 쪼개서 >> 그래서 쪼개서 사용해야해서 다중 상속이 가능하다

2. 추상클래스는 단일 상속이 원칙 (여러개 상속이 필요하면 계층적 상속쓰세요)

3. 추상클래스(완성 + 미완성)

4. 인터페이스는 (상수를 제외한 나머지는 미완성 자원(추상)자원)

인터페이스는 소프트웨어 설계 최상위 단계
(경험이 필요해서 어려워)

++개발자(초급)++




1. 인터페이스를 [다형성] 으로 보세요. (인터페이스는 부모 타입)
2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능
   (인터페이스를 구현함으로써 같은 부모를 갖게 해주는거임)
3. JAVA API에 우리들이 사용할만한 수많은 Interface 만들어 놓았어요
   (가져다 쓰는 것만 해도)
4. 인터페이스 (관용적) : (~able)을쓴다
   ex) 수리할수 있는, 날 수 있는 => ex) Cloneable 등
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
5. 객체간 연결 고리(객체간 소통) >> 다형성을 통해서 >> 같은 부모를 둠으로써
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
*/
//interface Iable{
//    String print();
    //출력할때 print 함수 사용 ->  return 타입은 문자열이야
//}

//class Test implements Iable{
//    
//    @Override
//    public String print() {
//        // TODO Auto-generated method stub
//        return null;
//    }
//}

//설계표준 >> 구현 강제 >> 재정의

/*
1. 실제 구현부를 가지고 있지 않다 => 함수인데 실행블럭이 없는거야(ex. void run(); )
게임 설계에서 [이동은 move라고 해! 라고 강제구현 해야한다] >> 인터페이스로 >> 탱크, 마린 >> move 구현
>>JAVA API : Collection(동적배열 : 자료구조) >> Vector , [ArrayList], HashSet, [HashMap] 등등
Vector , [ArrayList], HashSet, [HashMap] >> 수많은 interface를 구현

2. 생성방법 (interface 자원)_(인터페이스는 무조건 public)

2-1. public static final int VERSION = 1 >> int VERSION = 1 >> 이렇게만 쳐도 컴파일러가 [public static final] 있다고 인식

2-2. public abstract void run(); >> [public abstract] 생략 >> void run()

//원칙적으로는 이렇지만
interface Iable { 
    public static final int VERSION = 1
    public abstract void run();
}

//실제로는
interface Iable {
    final int VERSION = 1
    void run();
    String move(int x, int y);
}

interface Iable{}
interface Bable{int NUM=0}
interface Cable{void run(); void move();}

class Test extends Object implement Iable, Bable, Cable


 */


interface Humanable{
    int AGE = 100;
    String GENDER = "남";
    
    String print();
    void message(String str);
    
}

interface Iable{
    int AGE = 10;
    void info();
    String val(String s);
}

class Test extends Object implements Humanable , Iable{

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String val(String s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void message(String str) {
        // TODO Auto-generated method stub
        
    }
    
}






public class Ex03_Interface {

    public static void main(String[] args) {
        Test t = new Test();
        
        Humanable h = t; //부모는 자식객체의 주소를 가질수 있다, 모든 인터페이스는 부모객체니까
                        
        System.out.println(h.AGE);
        
        Iable ia = t;
        System.out.println(ia.AGE);
        
    }

}




















