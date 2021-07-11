//설계도
class Tv{
	boolean power;	//default 값은 false
	int ch;
	
	void power() {
		this.power = !this.power;
		//false값에 !하면 true로 바뀌고 다시들어가서 false로 바뀌고 전원 켜지고 꺼지고
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
	
}
//비디오 플레이어
class Vcr{
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {
		
	}
	void ff() {
		
	}
}
/*
Tv 설계도 1개
Vcr 설계도 1개

TvVcr 이라는 제품
1. class TvVcr extends Tv, Vcr >> 다중상속 금지
2. class Tv extends Vcr 하고 TvVcr extends Tv ? power 자원이름 충돌

해결 : class TvVcr extends Tv {Vcr vcr }

>> class TvVcr { Tv t; Vcr v;}
>> class TvVcr extends Tv { Vcr vcr;}
>> class TvVcr extends Vcr { Tv tv;}

Q : Tv상속 ? 아니면 Vcr 상속?
기준 : 주기능, 메인기능! >> 둘 중에 비중↑ >> 비중이 높은 클래스 (상속)
      >> 나머지 포함 처리

 */
class TvVcr extends Tv{
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr();
	}
}
















public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("전원 : "+t.power);
		t.chUp();
		System.out.println("전원 : "+t.ch);
		
		//비디오로 바뀜
		t.vcr.power();
		System.out.println("비디오전원 : "+t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("전원 : "+t.power);
		System.out.println("비디오전원 : "+t.vcr.power);
		
	}

}
