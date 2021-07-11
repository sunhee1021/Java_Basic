
public abstract class Ironman {
	
	//템플릿 메소드
	public final void makeIronMan() {
		System.out.println("=====아이먼맨 제작을 시작합니다=====");
		prepare_Ironman();
		assemble_Ironman();
		install_Jarvis();
		turnOn_Ironman();
		System.out.println("!!!!!!!!!!!!!!완성!!!!!!!!!!!!!!");
		System.out.println("");
		System.out.println("");
	}
	
	//일반 메소드 구현(자비스 설치, 아이언맨 전원ON)
	private void install_Jarvis() {
		System.out.println("소프트웨어 설치 중...");
	}
	private void turnOn_Ironman() {
		System.out.println("아이언맨 전원 ON");
	}
	
	//하위클래스에서 무조건 구현 할 추상 메소드(아이언맨 부품준비, 아이언맨 조립)
	public abstract void prepare_Ironman();
	public abstract void assemble_Ironman();
}



/**
 * 변경되지 않는 부분 
ironMan.준비();
ironMan.조립();
ironMan.자비스설치();
ironMan.전원ON();
 **/