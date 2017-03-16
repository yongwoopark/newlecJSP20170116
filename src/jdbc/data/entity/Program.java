package jdbc.data.entity;

import java.util.List;
import java.util.Scanner;

import jdbc.dao.mysql.MySQLMemberDao;
import jdbc.data.dao.MemberDao;

public class Program {

	public static void main(String[] args){
		
		//======= Controller =========================
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 아이디 : ");
		String uid = scan.nextLine();		
		
		MemberDao memberDao = new MySQLMemberDao();
		List<Member> list = memberDao.getList(uid);
		//========== View =================================
		for(Member m : list)
			System.out.printf("id는 '%s'이고 비밀번호는 '%s'이다\n", m.getId(), m.getPwd());
		
		/*
		Member t = new Member();
		t.setId("테스트1");
		t.setPwd("111");
		t.setName("오마이갓");
		
		memberDao.add(t);		
		
		list = memberDao.getList(uid);
		
		System.out.println("-----------------------------------------");
		//========== View =================================

		for(Member m : list)
			System.out.printf("id는 '%s'이고 비밀번호는 '%s'이다\n", m.getId(), m.getPwd());
		
		*/
		
		

	}

}
