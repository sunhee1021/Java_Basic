import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

    public static void main(String[] args) {
        //사원 한명을 만드세요
        Emp emp = new Emp(100,"김유신","군인");
        System.out.println(emp.toString());
        
        //사원 2명을 만드세요 (같은 타입이네?)
        //Array
        Emp[] emplist = {new Emp(100,"김씨","일반"),new Emp(200,"박씨","학생")};
        
        for(Emp e : emplist) {
            System.out.println(e.toString());
        }
        //1명이 입사를 더 했어요. 추가해주세요 (기존)
        //Emp[] emplist = new Emp[3];
        //기존 데이터를 이동시켜서 이관해야해 -> ArrayList가 해결해준당
        
        //Collection
        //ArrayList
        ArrayList elist = new ArrayList();
        elist.add(new Emp(1,"강씨","IT"));
        elist.add(new Emp(2,"김씨","IT"));
        //1명입사 //메모리가 부족하면 알아서 늘리니까 고민노노
        elist.add(new Emp(3,"이씨","IT"));
        System.out.println(elist.size());
        for(int i = 0; i <elist.size(); i++) {
            //System.out.println(elist.get(i));
            //Emp e = elist.get(i);
            //이렇게는 못써요.다운캐스팅 걸어줘야돼 //ArrayList 가 가지고 있는 배열 타입 Object[]...
            Object obj = elist.get(i);
            //System.out.println(obj);//재정의 한 toString()을 출력하는거임
            //toString 재정의 안해뒀으면 주소값이 나왔을거임
            Emp e = (Emp)obj;
            //Emp e = (Emp)elist.get(i);
            System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
            
        }
        for(Object e : elist) {
            //목적에 따라서는 downcasting이 필요할 수 있다
            Emp e2 = (Emp) e;
        }
        
        //개발자가 제일 싫어하는것중 하나 -> casting 예외
        //Object 싫어 -> 안쓰고 싶음
        //요청 java만든 사람들에게 ...
        //generic 타입 (객체 생성 타입을 강제)
        //현업에서는 90%가 제너릭을 씁니당 (안쓰면 까여요)
        ArrayList<Emp> list2 = new ArrayList<Emp>();
        //<Emp> -> Emp[]를 강제하는거임
        list2.add(new Emp(1,"A","IT"));
        
        for(Emp e : list2) { // Object 대신 Emp를 쓸수 있어 위에서 <Emp>해놔서!
            System.out.println(e.getEmpno());
        }
        
        
        
    }
    

}
















