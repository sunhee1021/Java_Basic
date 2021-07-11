import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {
    public static void main(String[] args) {
        //지역번호, 출석부, 우편번호, 회원가입정보
        HashMap loginmap = new HashMap();
        loginmap.put("kim", "kim1004");
        loginmap.put("scott", "tiger");
        loginmap.put("lee", "kim1004");
        
        //회원가입 끝 (회원정보)
        //로그인
        //id(o) , pwd(o) >> 로그인
        //id(o) , pwd(x) >> 비밀번호 재입력안내
        
        //논리적으로 4가지이지만 아이디가 안맞으면 비밀번호까지 확인할 필요도 없지
        //id(x) , pwd(o) >> 로그인 안됨
        //id(x) , pwd(x) >> 로그인 안됨
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("id, pwd 입력해주세요.");
            System.out.println("ID");
            String id = sc.nextLine().trim().toLowerCase();
            
            System.out.println("PWD");
            String pwd = sc.nextLine().trim();
            
            if(!loginmap.containsKey(id)) {
                //id가 맞지않은경우
                System.out.println("id가 맞지 않습니다. 재입력");
            }else {
                if(loginmap.get(id).equals(pwd)) {
                    System.out.println("회원님 안녕?");
                    break;
                }else {
                    System.out.println("비밀번호를 확인해주세요.");
                }
            }
        }
    }

}

