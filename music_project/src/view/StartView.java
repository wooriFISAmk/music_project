package view;

import controller.SongController;

public class StartView {

	public static void main(String[] args) {
		
		// 전체 노래 조회
		System.out.println("***** 전체 노래 조회 *****");
		SongController.getAllSongs();
		
	}

}
