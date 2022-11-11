package l1.l2.member.model.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Member {

	private String member_id;
	private String member_pw;
	private String member_name;
	private String phone;
	private String email;
	private String address;
	private Date reg_day;
	private Date modi_day;
	private String status;
	private int point;

	public Member() {
		// TODO Auto-generated constructor stub
	}
	
}
