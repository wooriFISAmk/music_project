package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.SongDTO;

public class SongServiceImp implements SongService {

	@Override
	public ArrayList<SongDTO> getAllSongs() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SongDTO getSongBySongName(String songName) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteSongBySongNameAndArtist(String songName, String artist) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUrlBySongName(String songName, String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createSong(SongDTO song) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}
