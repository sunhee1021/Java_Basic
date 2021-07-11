
interface Irepairable{
    
}
class Unit2{
    int hitpoint;   //기본 에너지
    final int MAX_HP; //최대 에너지
    Unit2(int hp){
        this.MAX_HP = hp;
    }
}

//지상 유닛
class GroundUnit extends Unit2{

    GroundUnit(int hp) {
        super(hp);
    }
    
}

//공중 유닛
class AirUnit extends Unit2{

    AirUnit(int hp) {
        super(hp);
    }
    
}

//건물
class CommandCenter implements Irepairable{
    
}

class Tank2 extends GroundUnit implements Irepairable{

    Tank2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Tank2]";
    }
    
}

class Marine2 extends GroundUnit {

    Marine2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Marine2]";
    }
    
}

//Scv기능 자원채취 (광물, 치료, 에너지 추가공급 가능 등)
class Scv extends GroundUnit implements Irepairable{

    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Scv]";
    }
    
    //Scv 만의 구체화되고, 특수화된 기능
    //repair(수리하는기능)이 가능하대
    
//    void repair(Tank2 tank) {
//        if(tank.hitpoint != tank.MAX_HP) {
//            System.out.println("공격당했네요");
//            tank.hitpoint += 5;
//        }
//    }
//    
//    void repair(Scv scv) {
//        if(scv.hitpoint != scv.MAX_HP) {
//            System.out.println("공격당했네요");
//            scv.hitpoint += 5;
//        }
//    }
/*
Unit 종류가 30개 (근데 그중에 25개만 치료할수있대)
Scv repair 해야하는 Unit의 개수가 증가하면 함수의 개수도 같이 증가
고민 : 하나의 함수가 Unit repair 할 수 있다면?
전자제품 매장에서 썼던거..... 상속관계에서 부모타입 ... 다형성을 썼었어...그럼 전자제품 매장하고 같은거 아닌가?

void repair(Unit2 unit){} 이렇게하면?
>> Marine2는 Scv가 치료해줄수 없대(대상이 아니래)
그럼 Unit2를 쓸수가 없네?
그럼
void repair(GroundUnit unit) 하면? >> 여기도 Marine이 있잖아?
음........
근데 CommandCenter 도 repair 대상이잖아? (여긴 Unit과 연관성이 없는데...)

인터페이스 Irepairable 을 부모로 해서 해볼까

인터페이스는?
서로 연관성이 없는 클래스를 하나로 묶어주는 기능
(인터페이스를 구현함으로써 같은 부모를 갖게 해주는거임)


class CommandCenter implements Irepairable{
class Tank2 extends GroundUnit implements Irepairable
class Scv extends GroundUnit implements Irepairable

Irepairable 는 Scv 의           부모타입이다
Irepairable 는 Tank2 의         부모타입이다
Irepairable 는 CommandCenter 의 부모타입이다
 
 
 */
    void repair(Irepairable repairunit) {
    //repairunit parameter 는 Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있음
    //void repair(new Tank2())
    //void repair(new CommandCenter())
    //void repair(new Scv())
    //부모타입은 자식타입의 주소를 받을 수 있는데 ... 부모것만 볼수 있어(프라이버시를 지켜줘)
        
    //정리
    //1. CommandCenter 와 Tank2, Scv 수리 방법이 틀리다
    //2. Irepairable repairunit 는 수리할 자원을 가지고 있지 않다.
    //그럼 Irepairable repairunit 통해서 위 3가지 Unit 온다고 가정하고 분류해보자
        
    //CommandCenter 와 Tank2, Scv 구분점 : Unit2 이냐 아니냐
    //타입비교 (연산자 : instanceof) 활용
    //https://cafe.naver.com/bit2021/141
        if(repairunit instanceof Unit2) { //Tank2 들어오면 Unit2 타입이냐고 물어봄
            
           Unit2 unit = (Unit2)repairunit; // unit >> Tank2, Marine 의 주소값
           //Tank2 에서 부모타입인 Unit2 자원만 접근
           //인터페이스가 일반 클래스보다 상위에 있다고 보면됨
           //그래서 다운 시켜주는거임
           //부모타입의 주소를 자식이 가지려면 자식으로 캐스팅 해야 한다
           
           if(unit.hitpoint != unit.MAX_HP) {
               unit.hitpoint = unit.MAX_HP;
           }
        }else {
            //부모 타입이 Unit2가 아닌거
            System.out.println("다른 충전 방식을 통해서 충전하세요. Unit2 타입이 아니에요");
        }
    }
}


public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();
        
        //전투
        tank.hitpoint -= 20;
        System.out.println("탱크 : " + tank.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(tank);
        System.out.println("탱크 수리 완료 : " + tank.hitpoint);
        
        scv.hitpoint -= 10;
        System.out.println("Scv : " + scv.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(scv);
        System.out.println("Scv 수리 완료 : " + scv.hitpoint);
        
        CommandCenter center = new CommandCenter();
        scv.repair(center);
        
        // scv.repair(marine); 컴파일조차 안돼요
        
    }
}




















