package week07;

class Movie 
{
	private String title, director, actors;
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}
}

public class MovieTest {
	public static void main(String[] args){
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		m1.setTitle("The Batman");
		m1.setActors("�ι�Ʈ ��ƾ��");
		m1.setDirector("�� ���꽺");
		m1.setYear(2022);
		
		m2.setTitle("��󷣵�");
		m2.setActors("���̾�");
		m2.setDirector("���̹̾�");
		m2.setYear(2016);
		
		m3.setTitle("���ڶ�");
		m3.setActors("��ȣ��");
		m3.setDirector("�Ǽ���");
		m3.setYear(2022);
		
		
		System.out.println("Title = "+m1.getTitle());
		System.out.println("Actor = "+m1.getActors());
		System.out.println("Director = "+m1.getDirector());
		System.out.println("Year = "+m1.getYear());
		System.out.println(" ");
		
		System.out.println("Title = "+m2.getTitle());
		System.out.println("Actor = "+m2.getActors());
		System.out.println("Director = "+m2.getDirector());
		System.out.println("Year = "+m2.getYear());
		System.out.println(" ");
		
		System.out.println("Title = "+m3.getTitle());
		System.out.println("Actor = "+m3.getActors());
		System.out.println("Director = "+m3.getDirector());
		System.out.println("Year = "+m3.getYear());
		System.out.println(" ");
		
}
}
