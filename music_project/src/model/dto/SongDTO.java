package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class SongDTO {
	private int songId;
	private String artist;
	private String songName;
	private String genre;
	private boolean artType;
	private String url;
}
