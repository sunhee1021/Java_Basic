import java.util.Vector;

/*
Collection FrameWork // FrameWork = 큰 틀(놀이공원)

[다수의 데이터]를 다루는 [표준화 된 인터페이스]를 구현하고 있는 클래스의 집합  //클래스를 새로 만들지 않고 가져다 쓴다

Collection 인터페이스 -> List 인터페이스(줄을 서시오) 상속 -> ArrayList(구현 : 수많은 약속을 이행하고있음)
                   -> Set 인터페이스(원안에 들어가시오) 상속  -> HashSet, TreeSet (구현)
                   -> Set 예시 - 로또
                   
Map 인터페이스 (key, value(pair_쌍으로 이루어짐)_ex.지역번호(02-서울),우편번호 -> HashMap(구현) 
 
1. List(줄을 서시오 :번호표) : 순서를 보장, 중복도 허용(2번 홍길동,3번 홍길동, 4번 홍길동_번호표때문에 구별가능하기때문)
                                   >>내부적으로 데이터(자료, 객체) >> [배열]관리(cart의 크기가 늘었다 줄었다 가능)
예)[홍길동][홍길동][홍길동]

구현하고 있는 클래스
1-1. Vector(구버전)       ->동기화 보장(멀티 스레드) -> Lock(장치) -> 성능 조금 -> 안전성
1-2. ArrayList(신버전)    ->동기화 보장(멀티 스레드) -> Lock(장치가 없음) : 필요에 따라서 쓸수 잇음 -> 성능 우선 -> 안정성 조금 떨어짐

----------------------------------------------
*기존의 여러개의 같은 타입의 데이터 관리 : Array 정적(고정)
-방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
int[] arr = new int[5];
arr[0] = 100;
... 10개의 방이 필요해 ... [줄이거나 늘리는 작업 불가]
int [] arr2 = new int[10]; //다시 만들어야해
arr 자원을 arr2 이관
----------------------------------------------
!!!복습!!!
Array
1. 배열의 크기 고정 : Car[] cars = {new Car(), new Car()}; //방 2개
2. 접근 방법(index)_방번호 접근 : cars[0]...........n번째 방까지 : (=length-1까지)
3. 초기 설정 불가

<-> Collection
List > Vector, ArrayList
1. 배열의 크기를 동적으로 확장 : 축소도 가능 >> 말도 안되는 이야기 >> 사실은 배열의 재할당!
2. 순서를 유지(내부적으로 index 배열 사용), 중복값 허용
3. 데이터의 저장공간으로 : Array를 씀


 */
public class Ex01_Vector {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("초기 default : 용량 : "+ v.capacity()); //10개 배열
        System.out.println("size : "+v.size()); 
        //size = 물의 양(배열의 전체크기 = capacity, 담겨진 데이터의 크기 : size)
        
        v.add("AA");
        v.add("AA");
        v.add("AA");
        
        System.out.println("데이터의 크기 : size :"+v.size());
        System.out.println(v.toString());//[AA, AA, AA] 
        //Vector가 toString 함수를 재정의 한거임(주소가 안나오잖아)
        //Array : length (만큼 for문 돌렸지)
        //Collection : size (length 대신 size만큼 돌리면 되겠지)
        
        for(int i = 0; i <v.size(); i++) {
            System.out.println(v.get(i));   //array[i] -> 함수 get()을 써야함
        }
        
        for(Object obj : v) {
            System.out.println(obj);
        }
        //제너릭 >> 타입을 강제 >> 추후 별도 학습
        Vector<String> v2 = new Vector<String>();
        v2.add("hello");
        v2.add("world");
        v2.add("king");
        
        for(String str : v2) {
            System.out.println(str);
            
        }
        ///////////////////////////////////////////////////////
        Vector v3 = new Vector(); 
        System.out.println(v3.capacity());
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        System.out.println(v3.capacity());
        System.out.println(v3.size());
        }

}



















