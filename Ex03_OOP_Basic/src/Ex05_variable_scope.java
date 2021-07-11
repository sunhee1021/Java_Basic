/*
 class 내부에 : instance variable (member field) = default값O
 method 내부에 : local variable (반.드.시 초기화 필요)
 ex) main(String[] args) >> 함수 >> 안에 모든 변수는 사용시 초기화
 static variable >> 공유자원(객체간) >> 객체 생성 이전에 메모리에 올라가는 자원
 (class area 또는 method area)





javac Ex05_variable_scope.java (컴파일)
java Ex05_variable_scope       (실행)

Ex05_variable_scope 정보 >> method(class) area
그때 클래스에서 static 자원이 있다면 그 자원을 memory road

*/

class Variable{
    int iv; //member field, instance variable)
    void method() {
        int lv = 0; //local variable 반드시 초기화)
        
        //for(int i = 0...i./block variable // for 안에서 유효)
    }
    static int cv;
    //1. class variable (클래스 변수), static variable (객체간 공유자원)
    //2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
    //heap 영역에 생성된 [객체]들의 [공유자원]
    //3. 특징 : 접근방법
    //3.1 class 이름.static  변수명 >>  Variable.cv >> why(객체가 생성되기 전에 접근 가능)
    //3.2 Variable c v = new Variable(); >> v.cv
    //    Variable c v2 = new Variable(); >> v2.cv
    //3.3 v.cv == v2.cv 같은 주소의 메모리
    //4. 생성시점 : Hello.java > javac Hello.java > Hello.class
    //   >java.exe Hello 엔터 실행...
    //   >class loader System 에 의해서
    //   클래스를 정보(metadata : 설명) class area(method area) 올려요
    //   --이 클래스 언제 만들었고 어떤 자원을 import 하고 있고 변수 몇개....기술..
    //   --이 클래스 안에 static variable 또는 static method 있으면
    //   --이 녀석을 memory (class area)에 올려놓는다
}
public class Ex05_variable_scope {
    //static+main 이 있으면 Ex05_variable_scope이 new로 객체생성을 해주지 않아도
    //돌아감
    public static void main(String[] args) {
        Variable v = new Variable();
        Variable v2 = new Variable();
        
        Variable.cv = 200;
        
        System.out.println(v.cv);
        System.out.println(v2.cv);
    }

}










