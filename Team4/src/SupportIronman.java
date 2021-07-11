
public class SupportIronman extends Ironman {
	
	@Override 
	public void prepare_Ironman() {
		System.out.println("SupportIronman 의 부품을 가져옵니다.");
		System.out.println("============준비완료============");
	}
	
	@Override
	public void assemble_Ironman() {
		System.out.println("SupportIronman의 부품을 조립합니다.");
		System.out.println("============조립완료============");
	}
}
