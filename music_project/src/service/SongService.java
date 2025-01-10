package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.SongDTO;

public interface SongService {
	
	public ArrayList<SongDTO> getAllSongs() throws SQLException;
	
	public SongDTO getSongByName() throws SQLException;
	
	public boolean deleteSongByName() throws SQLException;
	
	public boolean updateUrlByName() throws SQLException;
	
	public boolean createSong(SongDTO song) throws SQLException;
	
}
