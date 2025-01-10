package service;

import java.sql.SQLException;
import java.util.ArrayList;

import exception.SongException;
import model.SongDAO;
import model.dto.SongDTO;
import view.EndView;

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
		return SongDAO.updateUrlBySongName(songName, url);
	}

	@Override
	public boolean createSong(SongDTO song) throws SQLException, SongException {
		if(!SongDAO.checkSongBySongNameAndArtist(song.getSongName(), song.getArtist())) {
			throw(new SongException("이미 존재하는 노래 제목과 아티스트입니다"));
		}
		return SongDAO.createSong(song);
	}

}
