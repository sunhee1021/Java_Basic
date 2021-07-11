/*
추상클래스
>> 미완성 클래스 (완성되지 않은 설계도)
1. 완성된 코드 + 미완성 코드
2. 완성된 코드(함수기반인데 실행블럭이 [있는] 함수: void run(){}) + 미완성 코드(함수기반인데 실행블럭이 [없는] 함수)
3. 완성된 클래스(new 가능) : 미완성 클래스(스스로 객체 생성 불가능)

정리
1. 추상클래스는(미완성) : 스스로 객체 생성이 불가 (new를 사용하지 못함)
2. 추상클래스는 결국 ... 완성된 클래스로 만드는게 목적 
  (어떻게? 상속을 통해서)
3. 상속관계에서 미완성 된 자원(추상함수) 완성해라 (구현해라) >> 재정의 해라(추상자원)

설계자 입장에서
>> 의도 >> 상속 >> 반드시 재정의 해라 >> 강제적 구현하라는게 목적(믿지 못하니까)
 */

class Car{
    void run() {    //강제성이 없다. 해도되고 안해도 되고
        
    }
}

class Hcar extends Car{
    //Hcar run() 재정의 해도 되고, 안해도 문제 없다
    
}

//////////////////////////////////////////////////////////////////////////
abstract class AbClass{ //abstract 클래스 안에 최소 1개의 추상자원을 만들겠다
    //완성된 코드
    int pos;
    void run() {
        ++pos;
    }
    //미완성된 코드
    abstract void stop(); //실행 블록({})이 없어 >> 추상함수 >> 반드시 재정의 해서 사용해라 
}                         //>> 내용까지 강제할 수는 없음

class Child extends AbClass{

    @Override
    void stop() {   //강제적 구현
        this.pos = 0;
        System.out.println("stop : " +this.pos);
        
    }
    
}

class Child2 extends AbClass{
    
    @Override
    void stop() {
        this.pos = -1;
        System.out.println("stop : " +this.pos);
        
    }
}

public class Ex01_abstract_class {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
        ch.run();
        ch.stop();
        
        Child2 ch2 = new Child2();
        ///////////////////////////////////
        //다형성
        AbClass ab = ch;
        //부모타입의 참조변수는 자식타입 객체의 주소를 가질 수 있다(다형성)
        //단, 부모는 자기타입의 자원만 볼 수 있다
        
        ab.run();
        ab.stop(); //재정의 되어있기때문에
        //부모타입으로 접근해도 추상함수는 실행이 안됨
        //그래서 재정의된 [자식]이 갖고 있는 함수 호출(예외적으로)
    }

}










