package l1.l2.member.service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l1.l2.member.model.dao.MemberDao;
import l1.l2.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private MemberDao memberDao;
	

	@Override
	public List<Member> memberList(Member m) {
		List<Member> result = memberDao.memberList(sqlSession, m);
		
		return result;
	}



	
	
	

}
