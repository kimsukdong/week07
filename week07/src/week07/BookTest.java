package week07;

class Book {
	private String title, author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
public class BookTest {
	public static void main(String[] args){
		Book b = new Book();
		b.setTitle("Java Programming");
		b.setAuthor("James");
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());

	}
}
