package kr.or.bit;

//Stack 자료구조 설계
//저장공간이 필요해요 : Array : Object[] sarray
//MyStack my = new MyStack(); //기본적으로 배열 생성 //크기 설정 가능
//저장되는 값이 있는 위치정보(position,index)을 알아야함 하나넣으면 다음번지를 가르켜야해
//기능 : push(object), Object pop(return 값이 있어야해), isEmpty() 함수 만드세요, Full()

//Stack 자료구조 그림 그리고(draw) 암기 (응용)

public class MyStack {
    
    private int maxsize; //최대크기
    private int top; // 위치정보(배열의 index)
    private Object[] stackarr; //저장공간 //저장공간이 정적배열 arraylist를 쓸일도 add함수를 쓸일도 없다
    
    
    public MyStack(int maxsize){
        this.maxsize = maxsize;
        stackarr = new Object[maxsize];
        top = -1;
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxsize-1);
    }
    
    public void push(Object i) {
        if(isFull()) {
            System.out.println("stack full");
            //좀 좋게 짜려면 throw new 로 예외를 던져
        }else {
        stackarr[++top] = i;    //-1 이었으니까 0번째방에 들어갈수 있게++
        }
        
    }
    
    public Object pop() {
        Object value = null;
        
        if(isEmpty()) {
            System.out.println("stack empty");
            //throw new 예외객체하면 좋은 코드
        }else {
            value = stackarr[top];
            top--;
        }
        return value;
    }
    
    
    
    
}


