import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Collection FrameWork
표준화
[나열된 자원에 대해서 !!!순차적으로!!! 접근해서 값을 리턴하는 것에 대해서 표준화 하자] >> 인터페이스 설계

Iterator 인터페이스
>> hasNext() , Next(), remove() 추상함수
>> 구현 : ArrayList가 >> Iterator 를 구현했을거임

public Iterator iterator(){
    return new A implements Iterator
}
 */
public class Ex08_Collection_iterator {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        
        //출력(문제없다)
        for(int i =0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        //표준화된 방식으로 출력(조건. 데이터가 나열되어 있어야함(=나열된 자원에 대해서))
        Iterator it = list.iterator(); 
        //ArrayList가 Collection 인터페이스가 가지고 있는 추상함수 구현
        //public Iterator iterator(); >> 구현
        //논리제공 없이도 출력가능(뭐 i는 0부터 list.size까지 어쩌구저쩌구가 없어도)
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(10);
        intlist.add(11);
        intlist.add(12);
        
        Iterator<Integer> it2 = intlist.iterator();
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
        
//        public class Bank {
//            private int totalAccount;
//            private ArrayList<Account> accounts;
//            
//            public Bank() {
//                this.totalAccount = 0;
//                this.accounts = new ArrayList<Account>();
//            }
        
        /////////////////////////////////////////////////////////////
        System.out.println("*************************");
        
        //Iterator 인터페이스
        //역방향 조회도 가능 (조건 : 순방향 -> 다시 역방향)_(순방향으로 쭉갔다가 다시 역방향으로 가야함)
        ListIterator<Integer> it3 = intlist.listIterator();
        
        //순방향
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
        
        //역방향
        while(it3.hasPrevious()) {
            System.out.println(it3.previous());
        }
        
    } 

}
