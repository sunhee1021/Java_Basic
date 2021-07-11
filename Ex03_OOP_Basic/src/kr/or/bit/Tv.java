package kr.or.bit;
/*
 TV 설계도 요구사항정의
 TV 채널 정보를 가지고 있다 (예를 들면 1 ~ 200 값을 가질 수 있다)
 TV 브랜드 이름을 가지고 있다 (예를 들면 엘지, 삼성)
 TV 채널 전환 기능을 가지고 있다(채널은 한 채널씩 이동이 가능하다)
 ->채널을 증가 시키는 기능을 가지고 있다.
 ->채널을 감소 시키는 기능을 가지고 있다.
 */
public class Tv {
    public int ch; // default = 0
    public String brandname; // default = null (String이니까)
    
    //함수는 먹으면서 뛴다 2가지 못함 먹는거 1개 뛰는거1개
    //따라서 증가시키는거 하나 감소시키는거 하나
    public void ch_Up() {
        ch++;
    }
    public void ch_Down() {
        ch--;
    }
    
    //채널정보, 브랜드 이름을 출력 가능
    public void tv_Info() {
        System.out.printf("[%s],[%d] \n",brandname,ch);
    }
    
    
    
}
