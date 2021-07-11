import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODAY POINT!!!

public class Ex02_ArrayList {

    public static void main(String[] args) {
        //List 인터페이스 구현 : 순서있음, 중복허용 데이터 집합 다룰때 쓰는 클래스
        
        ArrayList arraylist = new ArrayList();
        //Object 타입을 가지는 정적배열이 heap에 생성
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        
        for(int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i)); // get ->0번째 방에 있는 값 리턴, 1번째 방에 있는 값 리턴 ...
        }
        System.out.println(arraylist.toString());
        System.out.println(arraylist.get(0));
        
        //순차적인 데이터 다루는 것이 .... (장단점)
        //비순차적인 데이터에 대해서 추가,삭제 >> ArrayList 적합하지 않음 >> 순서가 있는 데이터여야 해
        //[100,200,300] >> 오버라이드 아님
        //누가 전학와서 중간자리에 앉으면 뒤에 자리사람들이 하나씩 뒤로 밀려난거임
        arraylist.add(0, 111);
        System.out.println(arraylist);
        arraylist.add(400);
        System.out.println(arraylist);
        
        //arraylist.remove(100); //100을 데이터가 아니라 방번호로 봄 100번째방 없어서 에러나는거임
                                 // java.lang.IndexOutOfBoundsException
        
        //ArrayList 함수 공부(String 함수 학습과 동일)
        System.out.println(arraylist.contains(200)); //200 포함하고 있니? true
        System.out.println(arraylist.contains(2000)); // false
        
        arraylist.clear(); //데이터만 삭제(공간은 남아있음)
        System.out.println(arraylist.size()); //clear했으니까 0
        System.out.println(arraylist.isEmpty()); //비어있니? true
        
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        
        System.out.println(arraylist.isEmpty()); //false
        
        System.out.println("삭제전 : " + arraylist.size());
        Object value = arraylist.remove(0); // 0번째 방의 값을 삭제... 그 값을 return
        System.out.println("value : "+value);
        System.out.println("삭제후 : " + arraylist.size());
        System.out.println(arraylist.toString());
        
        //POINT!
        //개발자가 쓰는 코드... 일상다반사
        //다형성...(확장성, 유연성)
        List li = new ArrayList(); //중간에 한국타이어 고장나면 미쉐린타이어로 바꿔껴도된다
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라"); //방의 타입은 Object 그래서 문자도 들어가는거임
        
        List li2 = li.subList(0, 2); //subList를 통해서 데이터 집합을 하나더 생성하겠다
        System.out.println(li2.toString());
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        
        System.out.println(alist.toString());
        
        Collections.sort(alist); //toString 은 정렬이 안되니까 뒤에 toString 붙이면 안돼
        System.out.println(alist.toString()); //초급자는 sort 직접해야해(버블정렬).....힝
        
        Collections.reverse(alist);
        System.out.println(alist.toString());
    }

}













