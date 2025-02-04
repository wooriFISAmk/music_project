package song.service;

import java.sql.SQLException;
import java.util.ArrayList;

import song.model.SongDAO;
import song.model.dto.SongDTO;
import view.EndView;

public class SongServiceImp implements SongService {

	private static SongServiceImp instance = new SongServiceImp();

	private SongServiceImp() {
	};

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
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUrlBySongNameAndArtist(String songName, String artist, String url) throws SQLException {
		return SongDAO.updateUrlBySongNameAndArtist(songName, artist, url);
	}

	@Override
	public boolean createSong(SongDTO song) throws SQLException {
		if (!SongDAO.checkSongBySongNameAndArtist(song.getSongName(), song.getArtist())) {
			EndView.showError("이미 존재하는 노래 제목과 아티스트입니다");
			throw (new SQLException());
		}
		return SongDAO.createSong(song);
	}

}
