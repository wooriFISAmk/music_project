package view;

import controller.SongController;

public class StartView {

	public static void main(String[] args) {
		
		// 전체 노래 조회
		System.out.println("***** 전체 노래 조회 *****");
		SongController.getAllSongs();
		
		// TODO Auto-generated method stub
		//노래 제목으로 영상 url 수정
		System.out.println("\n***노래 제목으로 url 수정***");
		SongController.updateUrlBySongName("선물","https://www.youtube.com/watch?v=0SbNyKBh3VE");
	}

}
