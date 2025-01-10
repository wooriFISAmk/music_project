package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.SongDTO;

public interface SongService {
	
	public ArrayList<SongDTO> getAllSongs() throws SQLException;
	
	public ArrayList<SongDTO> getSongsByKeyword(String keyword) throws SQLException;
	
	public boolean deleteSongBySongNameAndArtist(String songName, String artist) throws SQLException;
	
	public boolean updateUrlBySongName(String songName, String url) throws SQLException;
	
	public boolean createSong(SongDTO song) throws SQLException;
	
}
