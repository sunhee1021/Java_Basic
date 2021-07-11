import java.util.ArrayList;

/*
TODAY POINT
Generic jdk 1.5
c#, java >> 필수 기능

Collection 클래스 >> 데이터 저장 공간 타입을 >> Object
1. Object 타입 저항 >> 타입 문제 >> 처음 객체를 생성할때 >> Type이라는걸 강제하게 만들자 >>!제너릭!<<
2. 타입 안정성 (타입 강제성)
3. 강제 형변환 (casting) : Car c = (Car)obj (X) 이제 이렇게 쓰지말자아아아아아아

    T obj;
    
    void add(T obj) {
        this.obj = obj;
    }
    
    T get() {
        return this.obj;
    }
    
}
 */


//클래스 설계(제너릭 적용) 설계도를 생성
class MyGen<T>{ //type parameter
    T obj;
    
    void add(T obj) {
        this.obj = obj;
    }
    
    T get() {
        return this.obj;
    }
    
}

class Person extends Object {
    int age = 100;
    
    
}

public class Ex06_Generic {

    public static void main(String[] args) {
       
        MyGen<String> mygen = new MyGen<String>();
        mygen.add("문자열");
        String str = mygen.get();
        System.out.println(str);
        
        ArrayList list = new ArrayList();
        //내부적인 저장 공간의 타입 : Object[] elements
        list.add(10);
        list.add(new Person()); //Object가 모든 클래스의 부모타입이라서 가능
        list.add("홍길동");
        
        for(Object obj : list) {
            //방안에 있는 녀석들의 타입정보
            //값타입, 객체타입 casting ...
            if(obj instanceof Person) { //타입을 확인해야만 빼낼(?)수가 있어 귀찮아
                Person p = (Person)obj;
                //Person p = obj; 이렇게가 안돼 다운캐스팅 해줘야되
                System.out.println(p.age);
            }else {
                System.out.println(obj);
            }
        }
        
        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(new Person());
        plist.add(new Person());
        
        for(Person p : plist) {
            System.out.println(p.age);
        }
    }

}
