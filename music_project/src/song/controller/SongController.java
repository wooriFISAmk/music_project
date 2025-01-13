package song.controller;

import java.sql.SQLException;

import song.model.dto.SongDTO;
import song.service.SongServiceImp;
import view.EndView;

public class SongController {

	private static SongServiceImp s = SongServiceImp.getInstance();

	public static void createSong(String songName, String artist, String genre, String url) {
		try {
			SongDTO song = SongDTO.builder().songName(songName).artist(artist).genre(genre).url(url).build();

			s.createSong(song);
			EndView.showMessage("새로운 노래가 추가되었습니다.");
		} catch (SQLException e) {
			// 예외 발생 시 실패 메시지 출력
			e.printStackTrace(); // 예외 내용 출력
			EndView.showError("노래 추가 실패");
		}
	}

	public static void getAllSongs() {
		try {
			EndView.songListView(s.getAllSongs());
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("전체 노래 조회 오류");
		}
	}

	// 노래 이름으로 URL 업데이트 메서드
	public static void updateUrlBySongNameAndArtist(String songName, String artist, String url) {
		try {
			s.updateUrlBySongNameAndArtist(songName, artist, url);
			EndView.showMessage("업데이트되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			EndView.showError("노래 수정 오류");
		}
	}

	public static void getSongsBySongName(String keyword) {
		try {
			EndView.songListView(s.getSongsByKeyword(keyword));
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("키워드로 노래 검색 조회 오류");
		}
	}

	public static void deleteSongBySongNameAndArtist(String songName, String artist) {
		try {
			s.deleteSongBySongNameAndArtist(songName, artist);
			EndView.showMessage("삭제되었습니다.");
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("노래 삭제 실패");
		}
	}

}
