package kr.or.bit;

//창문의 수를 가지고 있다.
//속도를 가지고 있다.

//2가지 속성을 캡슐화
//속도는 마이너스 값이 오면 0으로 초기화


//속도를 10씩 올리거나 감소하는 기능을 만드세요
//속도가 마이너스 값을 가지면 0으로 초기화

public class Car {
    private int window;
    private int speed;
  
    public int getWindow() {
        return window;
    }
    public void setWindow(int window) {
        this.window = window;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
            //this가 있으면 car클래스의 speed를 말함
            //앞에 this가 없으면 setSpeed 앞의 파라미터를 의미함
        }
    }
    
    public void speedUp() {
        this.speed += 10;
    }
    public void speedDown() {
        if(this.speed > 0) {
            this.speed -= 10;
        }else {
            this.speed = 0;
        }
    }
}
