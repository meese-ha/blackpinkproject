package blackpink.blink.domain;

import lombok.Data;

@Data
public class MemberVO {
	private Long memNum;
	private String memName,memPass, memId, memLevel,memPhone;
}
