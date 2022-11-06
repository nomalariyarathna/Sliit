/**
 * 
 */
package code;

/**
 * @author uobsep22
 *
 */
public class App {
	/**
	 * This is an object
	 * @see Book
	 * @see "refer how to write a class" 
	 */
	static Book book;
	/**
	 *  create a book and display the details of the book to the console
	 * @param String args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 book = new Book("Secret",1 , 1998, "Rhoda Byrne");
		
		String details = book.getBook_name() + "" + book.getYear() + "" + book.getAuthor();
		System.out.print(details);

	}

}
