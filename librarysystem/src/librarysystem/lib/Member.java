package librarysystem.lib;

import java.util.ArrayList;

public class Member implements Comparable<Member> {
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
	
	public void to_string() {
		System.out.println("회원명 : " + name);
		System.out.println("회원 id : " + member_id);
		System.out.println("연락처 : " + dial_number);
		System.out.println();
	}
	
	@Override
	public int compareTo(Member member) {
		int result = this.name.compareTo(member.getName());
		if(result == 0) { // 결과가 같을 경우엔 id를 비교한다.
			result = this.member_id.compareTo(member.getMember_id());
		}
		return result;
	}
	
	
}
