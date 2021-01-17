package librarysystem.lib;


/**
 * @작성자 : 김동윤
 * @작성일 : 2021. 1. 14.
 * @filename : Book.java
 * @package : librarysystem.lib
 * @description : 도서관 관리프로그램 중 책 개체 입니다.
 */
public class Book {
	private String book_title;
	private String book_id;
	private String book_author;
	private boolean reservation;

	public Book(String book_title, String book_id, String book_author) {
		this.book_title = book_title;
		this.book_id = book_id;
		this.book_author = book_author;
		this.reservation = false;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public boolean is_reserved() {
		return reservation;
	}

	public void make_reservation() {
		this.reservation = true;
		System.out.println("이 책 이미 예약되었습니다.");
	}
	
	public void to_string() {
		System.out.println("책 이름 : " + book_title);
		System.out.println("책 id : " + book_id);
		System.out.println("저자 : " + book_author);
		System.out.println();
	}
	
}
