package controller;

import java.sql.SQLException;

import model.SongDAO;
import model.dto.SongDTO;
import service.SongServiceImp;

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

}
