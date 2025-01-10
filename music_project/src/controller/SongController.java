package controller;

import java.sql.SQLException;

import exception.SongException;
import model.dto.SongDTO;
import service.SongServiceImp;
import view.EndView;

public class SongController {

	static SongServiceImp s = SongServiceImp.getInstance();
    
    public static void addSong(String artist, String songName, String genre, boolean artType, String url) {
        try {
        	SongDTO song = SongDTO.builder()
                    .artist(artist)
                    .songName(songName)
                    .genre(genre)
                    .artType(artType)
                    .url(url)
                    .build();
        	
        	s.createSong(song);
        	
            System.out.println("새로운 노래가 추가되었습니다.");
        } catch (SQLException | SongException e) {
            // 예외 발생 시 실패 메시지 출력
            e.printStackTrace();  // 예외 내용 출력
            EndView.showError("노래 삭제 실패");
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
   public static void updateUrlBySongName(String songName, String url) {
       try {
           s.updateUrlBySongName(songName, url);
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
	
	public static boolean deleteSongBySongNameAndArtist(String songName , String artist) {
		boolean result = false;
		try {
			result = s.deleteSongBySongNameAndArtist(songName, artist);
			System.out.println("삭제 완료");
		} catch(SQLException s) {
			s.printStackTrace();
			EndView.showError("노래 삭제 실패");
		}
		return result;
	}

}
