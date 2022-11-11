package l1.l2.member.model.dao;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import l1.l2.member.model.vo.Member;

@Repository
public class MemberDao {


	public List<Member> memberList(SqlSessionTemplate sqlSession, Member m) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("memberMapper.memberList", m );
	}

}
