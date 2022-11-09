package l1.l2.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import l1.l2.member.model.vo.Member;
import l1.l2.member.service.MemberService;

@Controller
public class MemberController {
	
//	private static final Logger logger = Log
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping("board.list")
	public String memberList(Model model, Member m) {
		
		List<Member> mList = memberService.memberList(m);
			model.addAttribute("mList",mList);
		return "mList";
		}
	
		/*
		 * @RequestMapping("memberTest.do") public string memberSelect(Member member,
		 * Model model) {
		 * 
		 * return "selectMember.mem"; }
		 * 
		 */
	
}
