/*
 this
 1. 객체 자신을 가르키는 this(앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
 2. this -> 객체 자신(생성자 호출) -> 원칙 : 생성자는 객체를 만들때 한번만 호출
 2-1. this 를 사용하면 여러개의 생성자 호출 가능(원칙을 깨고)
 */

class Test5{//전국구
    int i;
    int j;
    
    Test5(){
        
    }
    /*
    Test5(int i, int j){//지역구
        i = i;
        j = j;
    }
    
    Test5(int k, int z){//지역구
        //식사 문제 해결 >> this
        //개발자는 예측가능 (parameter 까지도 의미 부여)
        
        i = i;
        j = j;
    }
    */
    Test5(int i, int j){//지역구
        this.i = i; // 오른쪽은 바로위 parameter i (this로 구별)
        this.j = j;
    }
}

class Book2{
    String bookname;
    
    Book2(String bookname){
        this.bookname = bookname;
    }
}

//TODAY POINT
class Socar{
    String color;
    String geartype;
    int door;
    
    public Socar() {
        this.color = "red";
        this.geartype = "auto";
        this.door = 2;
    }
    public Socar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    
    void print() {
        System.out.println(this.color + "/" + this.geartype + "/" + this.door);
        
    }
}




public class Ex19_this {

    public static void main(String[] args) {
        Test5 test5 = new Test5(10,10);
        System.out.println(test5.i);
        System.out.println(test5.j);
        
        Socar socar = new Socar("red", "auto", 6);
        socar.print();
    }

}












