package zadatak1;

public class TestBook {

	public static void main(String[] args) {
		Author author = new Author("Stefan", "stefannjegomirovic@gmail.com", 'm');
		Book book = new Book("knjiga1", author, 123, 5);
		
		System.out.println(book.toString());
	}

}
