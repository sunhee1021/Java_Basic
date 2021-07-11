import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 인터페이스를 구현하는 클래스
//Set 원안에 들어가세요 (순서 보장(X) ,중복(X)) : 순서가 없고 중복을 허용하지 않는 데이터의 집합(ex.로또)
//HashSet, TreeSet

public class Ex09_Set {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2);  //자루안에 55라는 값이 정상적으로 들어감(=true)
        
        bo2 = hs.add(1);  //보장 : 중복값X
        System.out.println(bo2);
        
        System.out.println(hs.toString()); //배열이 아님 [1, 100, 55] 이렇게 나왔다고 헷갈리면 안돼
        
        hs.add(2);
        System.out.println(hs.toString()); //순서대로 나와? No, 순서보장X 배열아니에요[1, 2, 100, 55]
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("F");
        hs2.add("c");
        hs2.add("Z");
        hs2.add("A");
        hs2.add("A");
        hs2.add("A");
        
        System.out.println(hs2.toString()); //[A, b, c, F, Z] 중복값 없다
        
        String[] obj = {"A","B","C","D","D","A"};
        HashSet<String> hs3 = new HashSet<String>();
        for(int i = 0; i<obj.length; i++) {
            hs3.add(obj[i]);
        }
        System.out.println(hs3.toString());
        
        //Quiz
        //HashSet을 사용 1~45 난수 6개 넣으세요.
        
        HashSet<Integer> lotto = new HashSet<Integer>();
        
        for(int i = 0; lotto.size() < 6; i++) {
            //for(int i = 0; i < 6; i++)이렇게 하면 6개값이 나올때도 있고
            //5개가 나올때도 있어 그래서 i<6을 lotto.size() < 6 으로 바꿔주는거임
            lotto.add((int)(Math.random()*45+1));
           
        }
        System.out.println(lotto);
        
        Set set2 = new HashSet();  //다형성 Set 인터페이스
        int index = 0;
        while(set2.size() < 6) {
            int num = (int)(Math.random()*45+1);
            set2.add(num);
        }
        System.out.println("lotto : " + set2);
        
        HashSet<String> set3 = new HashSet<String>();
        set3.add("AA");
        set3.add("DD");
        set3.add("ADC");
        set3.add("FFF");
        System.out.println(set3.toString());
        
        //iterator 출력
        
        
        
        Iterator<String> st = set3.iterator();
        while(st.hasNext()) {
            System.out.println(st.next()); //set -> !!!배열아님!!!
        }                                 //!순서!는 보장하지 않지만 !순차적!으로 데이터 출력가능
    }

}













