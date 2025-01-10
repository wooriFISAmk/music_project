package controller;

import java.sql.SQLException;

import service.SongServiceImp;
import view.EndView;

public class SongController {

	static SongServiceImp s = SongServiceImp.getInstance();
	
	public static void getAllSongs() {
		try {
			EndView.songListView(s.getAllSongs());
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("전체 노래 조회 오류");
		}
	}
}
