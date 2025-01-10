package controller;

import java.sql.SQLException;

import model.SongDAO;
import model.dto.SongDTO;
import service.SongServiceImp;
import view.EndView;

public class SongController {

	static SongServiceImp s = SongServiceImp.getInstance();
	
	// 새로운 노래 추가 로직
	public static boolean createSong(SongDTO song) {
		boolean result = false;
		try {
			result = SongDAO.createSong(song);
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return result;
	}
		
	public static void getAllSongs() {
		try {
			EndView.songListView(s.getAllSongs());
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("전체 노래 조회 오류");
		}
	}
}
