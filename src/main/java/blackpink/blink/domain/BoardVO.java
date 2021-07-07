package blackpink.blink.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	private Long boardNum, memNum;
	private String boardTitle,boardContent,boardType;
	private Date boardDate;
}
