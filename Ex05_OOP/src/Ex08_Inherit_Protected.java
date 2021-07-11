import kr.or.bit.Pclass;

/*
private , default, public, [상속관계]에서 protected

protected :  박쥐 (양면성) >  어떤때는 default였다가 , 어떤때는 public 이었다가

>>상속이 없는 클래스 안에서 protected 접근자는 default 와 같다
>>결국 상속관계에서만 의미를 가진다


 */
class Dclass{
    public int i;
    private int p;
    int s; // default
    protected int k; // default와 같음(상속관계가 없잖아)
                     // 그래서 일반클래스에서는 사용할 이유가 없음
}

class Child2 extends Pclass{
    void method() {
        this.k = 100;   //상속관계에서 protected -> public처럼 쓰임
        System.out.println(this.k);
    }
    
}


public class Ex08_Inherit_Protected {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();
    }

}
