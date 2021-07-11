/* 과제 이거 외워와
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다

시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은 감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다

1차 코드 (물건이 3개 ... 구매할 수 있는 함수)

1차 오픈
-하와이 휴가

공식오픈
매장에 제품이 1000개의 다른 종류의 제품이 들어오게됨 (마우스, 토스트기) 제품등록(자동화)
매장에 1000개의 제품 전시
고객 >> 고객 불만 >> 3개 제품만 살수 있다  >> 997개 판매 불가

전화 >> 욕 >> PC방 >> 국내 전산망 >> 개발 서버 접속 >> 남은 휴가3일
>> 997개의 함수를 만들었어요(마우스 함수, 토스트기 함수 등등)

변화에 대응하는 코드를 만들지 못했다
>> 즐거운 휴가를 보내기 위한 방법을 제시
1. 함수를 하나로 통합할 방법
2. 제품이 이름 어찌어찌...
3. buy 함수를 하나만 만들어서 파라미터를 product 객체로 받으면 될 것 같습니다.


 */

class Product{
    int price;
    int bonuspoint;
    
    Product(int price){
        this.price = price;
        this.bonuspoint = (int)(this.price/10.0);
    }
}

class KtTv extends Product{
    //가격정보는 부모가 갖고있음
    KtTv(){
        super(500);
    }
    //주인이 가격설정할수있게 오버로딩
    
    //이름 재정의
    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio extends Product{
    //가격정보는 부모가 갖고있음
    Audio(){
        super(100);
    }
    //주인이 가격설정할수있게 오버로딩
    
    //이름 재정의
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook extends Product{
    //가격정보는 부모가 갖고있음
    NoteBook(){
        super(150);
    }
    //주인이 가격설정할수있게 오버로딩
    
    //이름 재정의 
    @Override
    public String toString() {
        return "NoteBook";
    }
}

//구매자 (시뮬레이션을 위한)
class Buyer{
    int money = 1000;
    int bonuspoint;
    
    //구매자는 구매 행위를 할 수 있다(기능(메소드)으로 빼야함)
    //구매행위(잔액 - 제품의 가격만큼 감소, 포인트는 정보 갱신(증가))
    //*******구매자는 매장에 있는 모든 물건을 구매할 수 있다*******
    
    /*
    void KttvBuy(KtTv n) {    //구매자가 어떤 물건을 사는지 정보를 알아야 ( 그 물건의 가격정보를 얻어올수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^ !" +this.money);
            return; //함수 종료시키는법 (구매행위 종료)
        }
        //실제 구매행위
        this.money -= n.price;  //잔액
        this.bonuspoint += n.bonuspoint; //누적
        System.out.println("구매한 물건은 : "+ n.toString());//왜 toString?
        //위에 tv,Audio,NoteBook 을 설정해 놨으니까
        
    }
    
    void Audio(Audio n) {    //구매자가 어떤 물건을 사는지 정보를 알아야 ( 그 물건의 가격정보를 얻어올수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^ !" +this.money);
            return; //함수 종료시키는법 (구매행위 종료)
        }
        //실제 구매행위
        this.money -= n.price;  //잔액
        this.bonuspoint += n.bonuspoint; //누적
        System.out.println("구매한 물건은 : "+ n.toString());
    
}
    void NoteBook(NoteBook n) {    //구매자가 어떤 물건을 사는지 정보를 알아야 ( 그 물건의 가격정보를 얻어올수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^ !" +this.money);
            return; //함수 종료시키는법 (구매행위 종료)
        }
        //실제 구매행위
        this.money -= n.price;  //잔액
        this.bonuspoint += n.bonuspoint; //누적
        System.out.println("구매한 물건은 : "+ n.toString());

    }*/
    //2차 개선 : 하나의 이름으로 여러가지 기능(메소드 오버로딩)
    //반복되는 코드를 줄여볼까? 
    //모든 제품은 Product를 상속 받았었으니........모든제품의 부모는 Product
    //다형성
    //Product p;
    //KtTv t = new KtTv();
    //p = t;
    
    void Buy(Product n) {    //구매자가 어떤 물건을 사는지 정보를 알아야 ( 그 물건의 가격정보를 얻어올수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^ !" +this.money);
            return; //함수 종료시키는법 (구매행위 종료)
        }
        //실제 구매행위
        this.money -= n.price;  //잔액
        this.bonuspoint += n.bonuspoint; //누적
        System.out.println("구매한 물건은 : "+ n.toString());//왜 toString?
        //위에 tv,Audio,NoteBook 을 설정해 놨으니까
        //위에서 override를 해놨기때문에 주소값이 아닌 이름이 나오는거임
    }
    
}
public class Ex12_Inherit_KeyPoint {

    public static void main(String[] args) {
        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();
        
        Buyer buyer = new Buyer();
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);
        
    }

}





