package blackpink.blink.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SongVO {
	private Long albumNum;
	private String songName,songWriter, songComposition,songLyrics;

}