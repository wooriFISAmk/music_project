package controller;

import java.sql.SQLException;

import service.SongService;

public class SongController {

	public static void updateUrlBySongName(String songName, String url) {
		// TODO Auto-generated method stub
		try {
			SongService.updateUrlBySongName(songName, url);
		} catch(SQLException e){
			//e.printStackTrace();
			System.out.println("error");
		}
	}

}
