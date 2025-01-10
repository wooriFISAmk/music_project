package view;

import controller.SongController;
import model.dto.SongDTO;

public class StartView {

	public static void main(String[] args) {
		// 노래 추가 로직
		System.out.println("노래 추가");
		
		SongDTO song = SongDTO.builder()
				.artist("오렌지")
				.songName("사과")
				.genre("랩")
				.artType(false)
				.url("naver.com")
				.build();
		
		boolean isAdded = SongController.createSong(song);
		
        // 노래 추가 결과 확인
        if (isAdded) {
            System.out.println("새로운 노래가 추가되었습니다.");
        } else {
            System.out.println("노래 추가에 실패했습니다.");
        }
		
		// 전체 노래 조회
		System.out.println("***** 전체 노래 조회 *****");
		SongController.getAllSongs();

		//노래 제목으로 영상 url 수정
		System.out.println("\n***노래 제목으로 url 수정***");
		SongController.updateUrlBySongName("선물","https://www.youtube.com/watch?v=0SbNyKBh3VE");
		
		// 키워드를 통해 노래 검색
		System.out.println("\n***** 키워드로 노래 검색 *****");
		SongController.getSongsBySongName("아이유");
		
	}

}
