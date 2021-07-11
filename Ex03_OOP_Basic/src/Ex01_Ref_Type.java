

import kr.or.bit.Apt; //import =  ctrl + shift + O(영문)
import kr.or.bit.Car;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;
import kr.or.bit.BodyInfo;

public class Ex01_Ref_Type {
    //회사 도메인을따서 패키지명을 정함
    //ex. kr.or.bit.dbutils.class
    //(bit.or.kr) 이 아닌 반대인 이유는
    //큰곳에서 작은곳으로 움직이는게 좋기때문에
    public static void main(String[] args) {
        Emp emp = new Emp(); // 참조변수
        System.out.println(emp.toString());
        //kr.or.bit.Emp@1db9742
        //kr.or.bit.Emp + @ + 주소
        
        emp.number = -100;
        System.out.println(emp.number);
        
        emp.setNum(-100);
        // 여기서 -값을 넣어도 
        // Emp.java에서 setter 함수에 조건을 걸어줬기때문에
        // 0으로만 나옴
        int result = emp.getNum();
        System.out.println(result);
        //getNum은 return이 있으니까
        //return이 있으면 무엇가를써서(ex.int) 받고
        // 없으면 그냥 받고
        
        emp.setEname("홍길동");
        String name = emp.getEname();
        System.out.println("name: "+name);
        
        int num = 100;  // 값타입 변수
        System.out.println(num);
        
        //답 : 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기위해서
        Apt sapt = new Apt();
        sapt.door = 20;
        System.out.println(sapt.door);
        System.out.println("주소: "+sapt);
        //kr.or.bit.Apt@106d69c
        
        Apt lapt = new Apt();
        lapt.door = 10;
        System.out.println(lapt.door);
        System.out.println("주소: "+lapt);
        //kr.or.bit.Apt@52e922
        
        Apt mapt = new Apt();
        System.out.println(mapt.door);
        System.out.println("주소: "+mapt);
        //생성된 메모리의 공간이 다르기때문에 주소값이 다름
        //kr.or.bit.Apt@25154f
        
        int i = 10;
        int j;
        j = i;
        j = 100;
        //i 값도 100이 되나요?
        //값할당
        
        //주소값 할당
        Apt apt = new Apt();
        Apt kapt = apt;
        
        apt.door = 9999;
        System.out.println(kapt.door);
        
        System.out.println("apt: "+apt);
        System.out.println("kapt: "+kapt);
        //주소값이 같게나옴(그림으로 그려보자(stack,heap))
        
        int[] arr = new int[5];
        int[] arr2 = arr; //주소값 할당
        //같은 주소를 참조합니다.
        
        //값타입 (8가지)
        //참조타입 (class, Array)
        
        Apt ap; // 선언 (stack 영역에 공간만 확보 : default 4byte)
        ap = new Apt(); //할당 (ap라는 변수가 메모리를 갖는다 = 객체의 주소값을 갖는다)
        //선언과 할당을 분리할수 있다
        System.out.println("ap 주소값: "+ap);
        ap = null;
        System.out.println("ap 주소값: "+ap);
        
        
        //초기화
        Apt ap2; //main 함수안에 있는 변수 scope = local variable > 로컬의 경우 사용하려면 초기화를 해야함
        //따라서 System.out.println(ap2); 라고 하면 출력 안된다
        ap2 = null;
        System.out.println(ap2);
        //이렇게 값을 초기화하고 나면 출력이 된다
        
        //함수안에 있기때문에 초기화를 해야함
        Car car;
        car = null;
        System.out.println(car);
        
        Apt ap3 = new Apt();
        System.out.println(ap3.car);
        
        
        Apt ap4 = new Apt();
        
        Apt ap5 = ap4;
        //주소값 비교
        //==
        System.out.println(ap3 == ap4); //비교연산자 뭐가? 변수가 가지고 있는 값
        System.out.println(ap4 == ap5); //true
        
        //Tv 한대를 생산하세요
        //제조회사 : 비트
        //ch : 5번 설정
        //정보를 출력하세요.
        
        Tv tv = new Tv();
        tv.brandname = "비트";
        //tv.ch = 5; 이걸원하는게 아님
        tv.ch_Up();
        tv.ch_Up();
        tv.ch_Up();
        tv.ch_Up();
        tv.ch_Up();
        
        tv.tv_Info();
        
        //사원 1명을 생성
        //사번 : 7788, 이름: 김유신, 부서: IT, 급여 1000
        //신체정보는 키는 190, 몸무게 40
        Person person = new Person();
        person.empno = 7788;
        person.ename = "김유신";
        person.job = "IT";
        person.sal = 1000;
        /*
        person.bodyInfo = new BodyInfo();
        person.bodyInfo.height = 190;
        person.bodyInfo.weight = 40;
        */
        
        //방법2
        BodyInfo info = new BodyInfo();
        info.height = 190;
        info.weight = 40;
        person.bodyInfo = info;
        
        
    }
}





































