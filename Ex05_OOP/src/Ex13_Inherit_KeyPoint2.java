/*
문제 풀어 보세요 ^^

요구사항 (카트 cart)

카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개 , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

​hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 )

hint) Buyer ..>> summary() main 함수에서 계산할때

​구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/
//제품이랑 가격 값을 설정
//+= 처리
//sum값에

//제품 클래스
// 제품 클래스
class Product2 {
    int price;      
    Product2(int price) {
        this.price = price;
    }
}

// 1번 제품
class Bread extends Product2 {
    Bread() {
        super(2000);        
    }
    @Override
    public String toString() {
        return "Bread";
    }
}

//2번 제품
class Drink extends Product2 {
    Drink() {
        super(3000);        
    }
    @Override
    public String toString() {
        return "Drink";
    }
}

//3번 제품
class Dryer extends Product2 {
  Dryer() {
      super(500);        
  }
  @Override
  public String toString() {
      return "Dryer";
  }
}

//4번 제품
class Phone extends Product2 {
    Phone() {
        super(5000);        
    }
    @Override
    public String toString() {
        return "Phone";
    }
}

//5번 제품
class Table extends Product2 {
    Table() {
        super(1000);        
}
@Override
public String toString() {
  return "Table";
}
}

// 구매자
class Buyer2 {
    int money = 10000;
    
    Product2[] size = new Product2[10];
    int i = 0; 
    
    void Buy(Product2 n) {
        // 가격초과시 잔액계산
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액 : " + this.money + "원");
            return; 
        }
        // 실 구매 행위
        this.money -= n.price;
        size[i++] = n;
        //이부분이 다형성
        //++i 면 1번째방에 물건을 넣어버리는거고
        //i++ 하면 0번째방에 넣고 ++처리 되는거임
        
        System.out.println("구매 제품 : " + n.toString() + " , 가격 : " + n.price + "원"); 
    }
    
    // 카트에 담긴 물건의 총 금액
    void summary() {
        int sum = 0;
        /* 아쉬운 코드
        for(int i = 0; i < size.length; i++) {
            if(size[i] == null) {
                break; // 이건 방어적인 코드, 안나오는게 좋다
            }
            sum += size[i].price;            
        }*/
        for(int i = 0; i < i; i++) {
        	sum += size[i].price;
        }
        System.out.println("총 구매 금액 : " + sum + "원");
    }
}


public class Ex13_Inherit_KeyPoint2 {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Drink drink = new Drink();
        Table table = new Table();
        Phone phone = new Phone();
        Dryer dryer = new Dryer();
        Buyer2 buyer2 = new Buyer2();
        
        buyer2.Buy(drink);
        buyer2.Buy(bread);
        buyer2.Buy(table);
        buyer2.Buy(dryer);
        buyer2.Buy(phone);
        
        buyer2.summary();
    }

}