package kr.or.bit;
/*
 우리 회사는 비행기를 주문 제작 판매하는 회사입니다.
 우리 회사는 비행기를 생산하는 설계도를 작성하려고 합니다.
 요구사항
 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다.
 2. 비행기가 생산되면 비행기의 이름과 번호 맞게 부여되었는지 확인하는 작업이 필요(출력정보 확인)
 3. 공장장은 현재까지 만들어진 비행기의 총대수(누적)을 확인할 수 있습니다.
 AirPlane air = new AirPlane();
 AirPlane air2 = new AirPlane();
 AirPlane air3 = new AirPlane();
 
 
 */
public class AirPlane {
    private int airnum;
    private String airname;
    private static int airtotalcount;
    
    public void makeAirPlane(int num, String name)
    {
        airnum = num;
        airname = name;
        //강제 누적 코드
        airtotalcount ++;
        
        AirPlaneInfo();
    }
    
    private void AirPlaneInfo() {
        System.out.println("비행기 이름 : " + airname + ", 번호 : " + airnum);
    }
    
    public void airPlaneTotalCount() {
        System.out.printf("비행기 누적대수 : [%d]\n", airtotalcount);
    }
}
