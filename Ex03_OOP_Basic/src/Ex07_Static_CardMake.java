import kr.or.bit.Card;

public class Ex07_Static_CardMake {

	public static void main(String[] args) {
		//Card 53장
		//heap메모리에 만든다 -> 왜냐면 객체니까
		Card c = new Card();
		c.number = 1;
		c.h= 80;	//static을 썼기때문에 여기서 한번만 변경해주면 밑에도 쭉 변경이 되는거임
		c.w= 50;
		c.kind  = "heart";
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfo();
		
		//고객..변심..카드가 작아요
		//h=80 w=50 요구사항 (반영)
		//프로그램 세계
		
	}

}
