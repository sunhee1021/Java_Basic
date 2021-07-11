/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 기본 사양을 살 수 도 있고 ....  여러가지 선택 옵션을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 4개 , 자동차의 색상 기본은 red 가 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다

자동차 구매
1. 기본 사양  
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 자동차의 색상 변경 , 문 기본
4. 옵션 : 자동차의 색상 변경 , 문 변경
*/


//이 코드는 좋은코드는 아니다
//1. parameter 이름이 모호 (member field 이름이랑 같이 하면 충돌나요)
//2. 개발자 성격 반복 해결 >>  해결 방법 this
class Car6{
    int carDoor;
    String carColor;
    
    public Car6() {
        carDoor = 4;
        carColor = "red";
    }
    public Car6(int door) {
        carDoor = door;
        carColor = "red";
    }
    public Car6(String color) {
        carDoor = 4;
        carColor = color;
    }
    public Car6(int door,String color) {
        carDoor = door;
        carColor = color;
    }
    
    public void carInfo() {
        System.out.println("door : " + carDoor + ", color : " + carColor);
    }
        
}
public class Ex17_Constructor {

    public static void main(String[] args) {
        
        Car6 car = new Car6();
        car.carInfo();
        
        Car6 car2 = new Car6("pink");
        car2.carInfo();

        Car6 car3 = new Car6(2,"gold");
        car3.carInfo();

    }

}
