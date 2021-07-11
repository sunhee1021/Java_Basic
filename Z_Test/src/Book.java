
public class Book {
	final String isbn;
	String title;
	int price;
	
	public Book(String isbn, String title, int price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	
	public String ISBN() {
		return isbn;
	}

	@Override
	public String toString() {
		return "isbn : " + isbn + ", title : " + title + 
				", price : " + price;
	}
	
}
