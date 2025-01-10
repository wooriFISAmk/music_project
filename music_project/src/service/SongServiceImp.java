package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.SongDAO;
import model.dto.SongDTO;

public class SongServiceImp implements SongService {

	private static SongServiceImp instance = new SongServiceImp();

	private SongServiceImp() {};

	public static SongServiceImp getInstance() {
		return instance;
	}

	@Override
	public ArrayList<SongDTO> getAllSongs() throws SQLException {
		return SongDAO.getAllSongs();
	}

	@Override
	public ArrayList<SongDTO> getSongsByKeyword(String keyword) throws SQLException {
		return SongDAO.getSongsByKeyword(keyword);
	}

	@Override
	public boolean deleteSongBySongNameAndArtist(String songName, String artist) throws SQLException {
		try {
			return SongDAO.deleteSongBySongNameAndArtist(songName, artist);
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUrlBySongName(String songName, String url) throws SQLException {
		// TODO Auto-generated method stub
		return SongDAO.updateUrlBySongName(songName, url);
	}

	@Override
	public boolean createSong(SongDTO song) throws SQLException {
		return SongDAO.createSong(song);
	}

}
