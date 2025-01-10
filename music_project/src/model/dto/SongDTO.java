package model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SongDTO {
	private int songId;
	private String artist;
	private String song;
	private String genre;
	private boolean artType;
	private String url;
}
