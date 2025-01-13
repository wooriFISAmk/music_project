package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
public class SongDTO {
	private int songId;
	private String artist;
	private String songName;
	private String genre;
	private String url;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("%-10s", "songId: " + songId));
		builder.append(" | ");
		builder.append(songName);
		builder.append("-");
		builder.append(artist);
		builder.append("(");
		builder.append(genre);
		builder.append(")");
		return builder.toString();
	}
}
