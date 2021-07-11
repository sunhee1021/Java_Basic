/*
 생성자 함수(constructor)
 1. 함수 (특수한 목적)
 
 2. 특수한 목적 ? (member field의 초기화가 목적)
 
 Tip) { 초기자 함수 } , static{ 초기자 함수 }
     //목적이 겹쳐서 static은 가끔쓰이지만 앞에건 거의 안쓰임
 
 3. 일반함수 다른점 (public void m(), public String m(String s)...)
 3-1. 함수의 이름이 고정(class이름과 동일)
 3-2. 실행시점 : 객체가 생성 됐을때(new가 됐을때) >> heap 이라는 공간이 할당되고
               >> 변수(member field)가 올라가고 >> 그다음에 생성자 함수 자동호출 됨
 3-3. 실행시점 : return type이 없음 >> 이뜻은 생성자 함수는 무조건 (void)
               >> 그렇기때문에 생략해도 무조건 void! 그래서 귀찮으니까 생략!
               >> 생략해도 void가 있는걸로 인지함
               >> public [void] 클래스 이름 >> public 클래스 이름
 
 4. 목적 : 생성되는 객체마다 [강제적으로] member field 값을 초기화 할 수 있다
 
 class Car{
     String color;
 }
 
 --자동차를 만들면 무조건 색상 하나를 가져야 한다 (조건)
 Car car = new Car()
 
 --자동차는 각각 다른 색상을 가질 수 있다
 class Car{
     public Car(String color){  //생성자 함수
     
     }
 }
 생성자함수를 써서 해놓으면 Car car = new Car(); 가 안됨
 //빈 괄호를 쓸수가 없음 parameter를 받아야함
 //Car car = new Car("red"); 이렇게
 
 5. 생성자 함수 (method overloading)
 
 6. 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면
 -- default 생성자 함수는 반드시 구현을 통해서만 사용가능하다
 */


//당신이 만약 자동차를 만든다면 반드시 자동차의 이름을 부여하세요

class Car{
    String carname = "포니";
    //보이지 않지만 default로 생성자 함수가 생략되어 있는거임
    //컴파일러가 알아서 생성
    //컴파일러가 이 코드를 public Car() {} 알아서 생성
    
    public Car() {
        System.out.println("나 생성자야"); //강제구현
    }
}

class Car2{
    String carname;
    public Car2() { //default constructor
        carname = "포니"; //그래서(default라서) 초기화를 해주는 거임
    }
}

class Car3{
    String carname;
    public Car3() {
        carname = "포니";
    }
    public Car3(String name) {
        carname = name;
    }
}
class Car4{
    String carname;
    //default 구현하지 않았어요
    //[예외적으로 overloading] 생성자를 구현했다면 default는 자동으로 생성되지 않음
    //설계자의 의도 ? 무조건 자동차 이름을 넣게하고 싶은거야
    //위에 6번 설명,4번설명 읽어봐
    public Car4(String name) {
        carname = name;
    }
}

public class Ex16_Constructor {

    public static void main(String[] args) {
        Car car = new Car(); //()생성자를 호출하는 괄호
        
        Car3 car3 = new Car3(); //default constructor 자동호출
        System.out.println(car3.carname);
        //이런경우엔 포니!
        
        Car3 car4 = new Car3("지네시스"); //overloading constructor
        System.out.println(car4.carname);
        
        Car4 car5 = new Car4("포드");
        System.out.println(car5.carname);
        
        Car4 car6 = new Car4("벤트");
        System.out.println(car6.carname);
    }

}


















