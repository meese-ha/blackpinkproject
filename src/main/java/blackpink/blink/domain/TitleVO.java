package blackpink.blink.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TitleVO {
	private Long albumNum;
	private String titleName,titleWriter, titleComposition,titleLyrics;

}