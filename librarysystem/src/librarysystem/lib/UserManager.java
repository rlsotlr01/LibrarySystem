package librarysystem.lib;

import java.util.ArrayList;
import java.util.Collections;

public class UserManager {
	
	ArrayList<Member> users = new ArrayList<Member>();
	
	public void add_user(Member member) {
		users.add(member);
	}
	
	public void show_user() {
		Collections.sort(users);
		System.out.println("유저 목록을 출력합니다.");
		for (int i=0; i<users.size(); i++) {
			users.get(i).to_string();
		}
	}
	
	public Member search_user_with_id(String user_id) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getMember_id() == user_id) {
				users.get(i).to_string();
				return users.get(i);
			}
		}
		System.out.println("찾으시는 id의 회원이 없습니다.");
		return null;
	}
	
	public Member search_user_with_name(String name) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getName() == name) {
				users.get(i).to_string();
				return users.get(i);
			}
		}
		System.out.println("찾으시는 이름의 회원이 없습니다.");
		return null;
	}
	
	public void edit_user(String name) {
		Member user = search_user_with_name(name);
		
	}
	
	public void delete_user(Member member) {
		users.remove(member);
		member.to_string();
		System.out.println("지정하신 유저가 목록에서 삭제되었습니다.");
	}
	
}
