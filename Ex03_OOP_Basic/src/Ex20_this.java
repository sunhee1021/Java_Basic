/*
 * 멤버필드,기능,메소드 
원칙 : 생성자는 객체 생성시 1개만 호출 가능
예외적으로
this 활용하면 여러개의 생성자를 호출할 수 있다
 */
//아래코드 중복이 보임
//값을 할당하는 부분이 중복적으로 보임 ... 할당하는 부분을 1개로 표현가능?O
/* before 코드(중복제거 전)
class Zcar{
    String color;
    String geartype;
    int door;
    
    Zcar(){
        this.color = "red";
        this.geartype = "auto";
        this.door = 2;
    }
    
    Zcar(String color, String geartype, int door){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    
    void print() {
        System.out.println(this.door + "," + this.geartype+ "," + this.color);
    }
}*/
class Zcar{
    String color;
    String geartype;
    int door;
    
    Zcar(){
        //생성자를 호출하는 this
        this("red", "auto", 2); //다시 나를 호출  //parameter 3개짜리 호출하는것
        //풀어쓰자면 new Zcar("red", "auto", 2);
        System.out.println("dafault constructor");
    }
    
    Zcar(String color, String geartype, int door){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");

    }
    
    void print() {
        System.out.println(this.color + "," + this.geartype+ "," + this.door);
    }
}

class Zcar2{
    String color;
    String geartype;
    int door;
    
    Zcar2(){
        this("red",1);
        System.out.println("default constructor");
    }
    Zcar2(String color, int door){
        this(color, door, "auto");
        System.out.println("overloading constructor param 2개");
    }
    Zcar2(String color, int door, String geartype){
        this.color = color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("overloading constructor param 3개");
    }
    void print() {
        System.out.println(this.color + "," + this.geartype+ "," + this.door);
    }
}


public class Ex20_this {

    public static void main(String[] args) {
        //Zcar zcar = new Zcar();
        //zcar.print();
        
        //Zcar zcar = new Zcar("pink","auto",10);
        
        //Zcar2 zcar = new Zcar2(); // red , 문1, auto
        //zcar.print();
        
        //Zcar2 zcar2 = new Zcar2("gold", 2); // gold , 문2, auto
        //zcar2.print();
        
        Zcar2 zcar3 = new Zcar2("red", 10, "auto"); 
        zcar3.print();
    }

}
/*
설계도 == 클래스 == 타입
속성 + 기능

클래스
정보
정보 초기화
정보기능

member field (캡슐화)
생성자 초기화
각각의 기능
*/