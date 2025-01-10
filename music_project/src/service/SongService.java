package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.SongDTO;

public interface SongService {
	
	public ArrayList<SongDTO> getAllSongs() throws SQLException;
	
	public SongDTO getSongBySongName() throws SQLException;
	
	public boolean deleteSongBySongName() throws SQLException;
	
	public boolean updateUrlBySongName() throws SQLException;
	
	public boolean createSong(SongDTO song) throws SQLException;
	
}
