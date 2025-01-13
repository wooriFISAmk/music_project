package song.service;

import java.sql.SQLException;
import java.util.ArrayList;

import song.model.dto.SongDTO;

public interface SongService {

	public ArrayList<SongDTO> getAllSongs() throws SQLException;

	public ArrayList<SongDTO> getSongsByKeyword(String keyword) throws SQLException;

	public boolean deleteSongBySongNameAndArtist(String songName, String artist) throws SQLException;

	public boolean updateUrlBySongNameAndArtist(String songName, String aritst, String url) throws SQLException;

	public boolean createSong(SongDTO song) throws SQLException;

}
