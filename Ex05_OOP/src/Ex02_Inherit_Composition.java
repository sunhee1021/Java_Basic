/*
현업(실무 개발 환경)
설계도 1개 
설계도 많다(업무가 복잡하다) 하나의 설계도 불가 >> 여러개의 설계도 나누어서
쇼핑몰 >> 회원관리, 배송관리, 주문관리, 상품관리 등등  >> 각각의 설계도 서로 관계

여러개의 설계도, 어떤기준에서 나누고 합치고 할까?

1. is ~ a  (무엇 은 ~ 이다 (부모를 뒤에) ) >> 상속
2. has a (무엇 은 ~ 을 가지고 있다) >> 포함

예)
1. 원 클래스 / 도형 클래스
원은 도형이다 ? (O)
원은 도형을 가지고 있다 ? (X)

>> 원 extends 도형


2. 원 클래스 / 점 클래스 관계
원은 점이다 ? (X)
원은 점을 가지고 있다 ? (O) - (컴퓨터는 모니터를 가지고 있다, 과제한거)

>> class 원 {
	점
}

3. 경찰 클래스 / 권총 클래스 
경찰은 권총이다 ? (X)
경찰은 권총을 가지고 있다 ? (O)

class 권총{}  //컴퓨터가 cpu를 가지고 있듯이 계속 가지고 있는게 아니라
class 경찰{	 //필요할때(출동할때) 권총을 가지고 있을수 있게
	void 출동(권총){
	
	}

예) 원, 삼각형, 사각형 만드는 설계도를 작성하세요

원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형 : 추상화 , 일반화 >> 공통자원이 들어가야 한다 
>> 그리다 라는 행위 , 색상, 
원 : 구체화, 특수화 >> 여기서는 그리다라는 행위, 색상은 안해줘도 돼 왜?
				>> 위에 도형이 가지고 있으니까
				>> 원은 반지름을 가지고 있다. 한점을 가지고 있다.
				
점 : 좌표값 >> (x,y)
-원은 점을 가지고 있다
-삼각형은 점을 가지고 있다
-사각형은 점을 가지고 있다

class Shape{그리다, 색상 }	  >> 상속관계 (부모Base가 되는거임)
class Point { x, y }  >> 포함이라는 관계로 하면 될것 같음

 */

class Shape{
	String color = "gold";
	void draw() {
		System.out.println("그리다");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1,1);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}
//원을 만드세요 (원의 정의는 한점과 반지름을 가지고 있다)
//1. 원은 도형이다 (상속받고)
//2. 원은 점을 가지고 있다. (원의 멤버필드로 점이 들어오는거임)
//3. 원은 반지름을 가지고 있다 (특수성 (멤버필드 r))

//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값 (10,15) 가진다
//기본(초기값)을 설정하지 않으면 반지름과 점의 값을 입력받을수 있다
class Circle extends Shape{
	Point point; // has a 관계로 (포함)
	int r; // 원의 구체화 특수성
	
	Circle(){
		//this.r = 10;
		//this.point = new Point(10,15);
		this(10,new Point(10,15));
	}
	Circle(int r, Point point){
		this.r = r;
		this.point = point;
	}
}

//위 원만든 것을 참조 하셔서
//문제
//삼각형 클래스를 만드세요
//삼각형은 3개의 점과 그리고 그리다라는 기능을 가지고 있다
//위에서 만든 Shape 와 Point를 제공받아서 사용
//default 삼각형을 만들 수 있고 3점을 받아서 그림을 그릴수 있다.
//(Point x, Point y, Point z 를 배열로 하면 100점짜리
class Triangle extends Shape{
	Point x;
	Point y;
	Point z;
	
	Triangle() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60));
	}
	
	Triangle(Point x, Point y , Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//구체화 , 특수화 
	//추가적인 기능 언제나 가능
	void trianglePoint() {
		System.out.printf("x : (%d,%d)\t",x.x,x.y);
		System.out.printf("y : (%d,%d)\t",y.x,y.y);
		System.out.printf("z : (%d,%d)\t",z.x,z.y);
		System.out.println();
}
}


//점의 배열 버전
class Triangle2 extends Shape{
	Point[] pointArray; 
	
	Triangle2(){
		this(new Point[] {new Point(10,20),
				new Point(30,40),new Point(50,60)});
	}
	
	Triangle2(Point[] pointArray){
		this.pointArray = pointArray;
	}
	
	//기능
	void trianglePoint() {
		for(Point point : this.pointArray) {
			System.out.printf("point : (%d , %d)\t\n", point.x,point.y);
		}
	}
}
public class Ex02_Inherit_Composition {

	public static void main(String[] args) {

		Circle circle = new Circle();
		System.out.println("반지름 : " + circle.r);
		System.out.println("부모자원 : " + circle.color);
		System.out.println("좌표 x값 : " + circle.point.x);
		System.out.println("좌표 y값 : " + circle.point.y);
		circle.draw();
		System.out.println("----------------------------");
		
		Circle circle2 = new Circle(20,new Point(10,20));
		System.out.println("반지름 : " + circle2.r);
		System.out.println("부모자원 : " + circle2.color);
		System.out.println("좌표 x값 : " + circle2.point.x);
		System.out.println("좌표 y값 : " + circle2.point.y);
		circle.draw();
		System.out.println("----------------------------");
		
		Triangle triangle = new Triangle();
		triangle.trianglePoint();
		triangle.draw();
		
		System.out.println("----------------------------");
		Triangle triangle2 = new Triangle(new Point(1,2),new Point(3,4),new Point(5,6));
		triangle2.trianglePoint();
		triangle2.draw();
		
		System.out.println("*************************");
		Point[] pointarr = {new Point(11,21),new Point(31,41),new Point(51,61)};
		Triangle2 tri3 = new Triangle2(pointarr);
		tri3.trianglePoint();
		tri3.draw();
		}
		
	
	}


