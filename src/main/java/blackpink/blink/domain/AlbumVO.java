package blackpink.blink.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AlbumVO {
	private Long albumNum;
	private String albumName;
	private Date songDate;
}
