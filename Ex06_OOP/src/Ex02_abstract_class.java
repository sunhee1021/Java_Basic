//게임 : Unit(종족)

//Unit : 공통기능 (이동좌표, 이동할수 있고, 멈춘다) : 추상화, 일반화
//Unit : 이동방법은 다르다 (이동 방법은 Unit 마다 별도의 구현 필요)
//추상클래스 

abstract class Unit{
    int x,y;
    
    void stop() {
        System.out.println("Unit stop");
    }
    
    abstract void move(int x, int y); //추상자원(구현부가 없음) // 강제구현
    
}

//Tank
class Tank extends Unit{

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동 : " + this.x + "," + this.y);
    }
    
    //Tank 만이 가지고 있는 것들 구체화, 특수화
    void changeMode() {
        System.out.println("탱크 변환 모드");
    }
}

class Marine extends Unit{
    
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동 : " + this.x + "," + this.y);
    }
    
    //Marine만이 가지고 있는 것들 구체화, 특수화
    void stimpack() {
        System.out.println("스팀팩 가능");
    }
}

class Dropship extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Dropship 이동 : " + this.x + "," + this.y);
                
    }
    
    //구체화 , 특수화
    void load() {
        System.out.println("Unit Load");
        
    }
    
    void unload() {
        System.out.println("Unit Unload");
    }
}

public class Ex02_abstract_class {

    public static void main(String[] args) {
        Tank t = new Tank();
        t.move(500, 200);
        t.stop();
        t.changeMode();
        
        Marine m = new Marine();
        m.move(500, 200);
        m.stop();
        m.stimpack();
        
        Dropship d = new Dropship();
        d.move(500, 200);
        d.stop();
        d.load();
        
        //1. 탱크 3대를 만들고 [같은 좌표]로 이동 시키세요 (555,444)
         Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
         for(Tank tank : tanklist) {
             tank.move(555, 444);
         }
         
        //2. 탱크 1, 마린1, 드랍쉽1 같은 좌표로 이동시키세요 (666,444)
         Unit[] unitlist = {new Tank(), new Marine(), new Dropship()};
         for(Unit unit : unitlist) {
             unit.move(666, 444);
         }
        
        
        
 
    }

}















