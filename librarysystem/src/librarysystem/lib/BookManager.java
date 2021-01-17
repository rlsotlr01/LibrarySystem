package librarysystem.lib;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	ArrayList<Book> books;
	
	// 파일 입출력 클래스도 만들어보기.
	
	public void add_book(Book new_book) {
		books.add(new_book);
		System.out.println("책이 추가되었습니다.");
	}
	
	public void search_book() {
		System.out.println("1. 전체 도서 목록 출력");
		System.out.println("2. 저자 검색");
		System.out.println("3. 도서명 검색");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		while(true) {
			if(choice == 1) {
				System.out.println("전체 도서 목록을 출력합니다.");
				System.out.println("현재 도서관에 존재하는 책의 목록은 아래와 같습니다.");
				print_book_list();
				continue; // 또는 while 로 continue 해야될 것 같은데.
			}else if(choice == 2) {
				System.out.println("저자를 검색합니다. 저자명을 입력해주세요.");
				System.out.print("저자명 :");
				String author_name = scan.nextLine();
				search_book_with_author(author_name);
				break;
			}else if(choice == 3) {
				System.out.println("도서명을 검색합니다. 도서명을 입력해주세요.");
				System.out.print("도서명 :");
				String book_name = scan.nextLine();
				search_book_with_name(book_name);
				break;
			}			
		}
		
	}
	
	public void print_book_list() {
		for(int i=0; i<books.size(); i++) {
			books.get(i).to_string();	
		}
	}
	
	public Book search_book_with_name(String book_title) {
		Book book = null;
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).getBook_title() == book_title) {
				book = books.get(i);
				System.out.println(book_title + " 라는 이름의 책을 찾았습니다.");
				book.to_string();
			}	
		}
		return book;
	}

	public void search_book_with_author(String author_name) {
		Book book;
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).getBook_author() == author_name) {
				book = books.get(i);
				System.out.println(author_name + " 라는 저자명을 가진 책을 찾았습니다.");
				book.to_string();
			}	
		}
	}
	
	// 대여기능
	public void reserve_book(Member member, Book book) {
		/*
		 *public void add_reserved_book(Book reserved_book) { 
		 *	reserved_book_list.add(reserved_book); 
		 *}
		 */
		
		member.add_reserved_book(book);
		System.out.println(member.getName()+" 님이 "+book.getBook_title()+" 책을 대여했습니다.");
		// 대충 이렇게?
	}
	
	// 반납기능
	public void return_book(Member member, Book book) {
		member.remove_reserved_book(book);
		System.out.println(member.getName()+" 님이 "+book.getBook_title()+" 책을 반납했습니다.");
		// 대충 이렇게?
	}
}
