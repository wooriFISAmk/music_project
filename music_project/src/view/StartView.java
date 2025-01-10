package view;

import controller.SongController;
import model.dto.SongDTO;

public class StartView {

	public static void main(String[] args) {
		
		// 전체 노래 조회
		System.out.println("*** 전체 노래 조회 ***");
		SongController.getAllSongs();

		// 노래 추가하기
		System.out.println("\n*** 노래 추가하기 ***");
		SongController.addSong("포도", "귤", "힙합", true, "google.com");
				
		// 노래 제목으로 영상 url 수정
		System.out.println("\n***노래 제목으로 url 수정***");
		SongController.updateUrlBySongName("선물","https://www.youtube.com/watch?v=0SbNyKBh3VE");
		
		// 키워드를 통해 노래 검색
		System.out.println("\n*** 키워드로 노래 검색 ***");
		SongController.getSongsBySongName("포도");
		
		// 노래 제목과 아티스트로 노래 삭제
		System.out.println("\n*** 키워드로 노래 검색 ***");
		SongController.deleteSongBySongNameAndArtist("포도", "귤");
	}

}
