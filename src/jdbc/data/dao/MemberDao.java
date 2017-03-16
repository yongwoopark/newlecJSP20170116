package jdbc.data.dao;

import java.util.List;

import jdbc.data.entity.Member;

public interface MemberDao {
	List<Member> getList(String query);
	int add(Member member);
}
