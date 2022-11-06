package code;

/**
 * This class is written to represent a detail of a book
 * @author Alwis
 *@version 1.0
 */
public class Book {
	/**
	 * 
	 */
	private String book_name;
	/**
	 * 
	 */
	private int book_id;
	/**
	 * 
	 */
	private int year;
	/**
	 * 
	 */
	private String author;
	
	
	/**
	 * @param book_name
	 * @param book_id
	 * @param year
	 * @param author
	 */
	public Book (String book_name, int book_id, int year, String author) {
		
		super();
		this.book_name = book_name;
		this.book_id = book_id;
		this.year = year;
		this.author = author;
	}
	

	public Book() {
		super();
	}


	public String getBook_name() {
		return book_name;
	}

	public int getBook_id() {
		return book_id;
	}

	public int getYear() {
		return year;
	}

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}
