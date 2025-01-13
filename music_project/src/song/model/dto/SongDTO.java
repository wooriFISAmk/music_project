package song.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SongDTO {
	private int songId;
	private String songName;
	private String artist;
	private String genre;
	private String url;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("%-10s", "id " + songId));
		builder.append(" | ");
		builder.append("🎵 ");
		builder.append(songName);
		builder.append(" - ");
		builder.append(artist);
		builder.append(" (");
		builder.append(genre);
		builder.append("| ");
		builder.append("🔊 ");
		builder.append(url);
		builder.append(")");
		return builder.toString();
	}
}
