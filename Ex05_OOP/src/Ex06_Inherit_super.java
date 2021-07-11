/*
this : 객체 자신을 가르키는 this (어디에 사용? 멤버필드에 대한 구분 (ex)this.empno)
this : 생성자를 호출하는 this (this(100,"red"))
this는 그 객체 안에서 쓰는거고

상속

부모

자식 (this)

super (현재 자식이 부모의 접근 주소값을 갖는것) : 상속관계에서 부모에 접근
>> 자식입장에서 보면 super는 부모의 객체의 주소

1. super >> 상속관계에서 자식이 부모의 접근
2. super >> 상속관계에서 부모의 생성자를 호출(명시적으로)

Tip)
c#이라는 언어는 부모를 base() 로 표현
자바는 부모를 super() 로 표현


!!!상속관계!!!에서 override
!!!상속관계!!!에서 super
 */
class Base{
    String basename;
    Base(){
        System.out.println("Base 기본 생성자 함수");
    }
    Base(String basename){
        this.basename = basename;
        System.out.println("basename : " + this.basename);
    }
    void method() {
        //super.method()
    System.out.println("나 부모 method");
}
}

class Derived extends Base {
    String dname;
    Derived(){
        System.out.println("Derived 기본 생성자 함수");
    }
    
    Derived(String dname){
        
        super(dname);
        //부모의 생성자를 호출하는것 (super() = Base() 같은역할)
        //상속관계에서 자식입장에서 부모쪽에 접근할수있는 유일한 방법 super
        this.dname = dname;
        System.out.println("dname : " + this.dname);
    }
        
        @Override
        void method() {
            //super.method()
        System.out.println("부모함수 재정의");
    }
        
    //어느날 부모님의 모습이 ... 그리워요
    //유일한 방법 super
        void parent_method() {
            super.method();
            //재정의 된걸 지우지 않고 쓰는법
        }
        
        
        
}
public class Ex06_Inherit_super {

    public static void main(String[] args) {
        //Derived d =new Derived();
        Derived d = new Derived("홍길동");
        //이렇게 되면 부모쪽은 어떤게 호출될까?
        //parameter 값이 없으니까 default 값이 호출되지
        d.method();
        //부모의 함수
        d.parent_method();
    }

}
