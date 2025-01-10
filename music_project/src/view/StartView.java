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
		
	}

}
