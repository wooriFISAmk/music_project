package view;

import controller.SongController;
import model.dto.SongDTO;
import oracle.net.aso.a;

public class StartView {

	public static void main(String[] args) {
		System.out.println("노래 추가");
		
		SongDTO song = SongDTO.builder()
				.artist("오렌지")
				.songName("사과")
				.genre("랩")
				.artType(false)
				.url("naver.com")
				.build();
		
		boolean isAdded = SongController.createSong(song);
		
        // 결과 확인
        if (isAdded) {
            System.out.println("새로운 노래가 추가되었습니다.");
        } else {
            System.out.println("노래 추가에 실패했습니다.");
        }
		

	}

}
