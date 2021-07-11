import kr.or.bit.Bird;

//Bird 를 상속받아서 구현

class Bi extends Bird{
    @Override
    protected void moveFast() {
        super.moveFast();  
    }
}

class Ostrich extends Bird{
    //구체화 특수화
    void run() {
        System.out.println("run^^");
    }
    
    @Override
    protected void moveFast() {
        run();
    }
}

public class Ex09_Inherit_Protected {

    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly();
        //POINT
        //bi.moveFast는 안보임
        //상속관계에서만 public
        //지금은 default로 쓰인거임(default는 같은폴더에서만 쓸수있지)
        bi.moveFast();
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();
    }

}
