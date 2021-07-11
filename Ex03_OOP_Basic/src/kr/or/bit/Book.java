package kr.or.bit;

/*
생성자가 있는 설계도 만들기  QUIZ 입니다 아래 요구사항에 맞는 설계도를 만들어보세요
 
책은 책이름을 가지고 있고 가격을 가지고 있다 
책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다

책의 이름과 가격 정보는 특정 기능을 통해서만 볼수 있고 , 
출판된 이후에서 수정할 수 없다
책이름과 가격정보는 각각확인 할 수 있다.
*/

public class Book {
    private String bookName;
    private int bookPrice;
    //캡슐화(수정할수 없다 private으로 접근하지않으면)
    
    public int getPrice() {
        return bookPrice;
    }

    public String getName() {
        return bookName;
    }
    //getter만 써야해
    //setter하면 수정할수 있게 되니까
   
    //default 생성자X -> 강제로 해라
    //public Book(){} 쓰지말아라
    public Book(String name,int price) {
        
        bookName = name;
        bookPrice = price;
    }
    
    
    
    public void bookInfo() {
        System.out.println("책 이름 : " + bookName + "가격 : " + bookPrice);
    }
}
