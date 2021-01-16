package librarysystem.lib;

import java.util.ArrayList;

public class Member {
	private String name;
	private String dial_number;
	private String member_id;
	private ArrayList<Book> reserved_book_list;
	
	public Member(String name, String dial_number, String member_id) {
		this.name = name;
		this.dial_number = dial_number;
		this.member_id = member_id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDial_number() {
		return dial_number;
	}
	public void setDial_number(String dial_number) {
		this.dial_number = dial_number;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public ArrayList<Book> getReserved_book_list() {
		return reserved_book_list;
	}
	
	public void add_reserved_book(Book reserved_book) {
		reserved_book_list.add(reserved_book);
	}
	public void remove_reserved_book(Book reserved_book) {
		reserved_book_list.remove(reserved_book);
	}
	
	
}
