package blackpink.blink.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	private Long replyNum,memNum,boardNum;
	private String replyContent, memName;
	private Date replyDate;
}