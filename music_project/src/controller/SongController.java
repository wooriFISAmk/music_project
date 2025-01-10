package controller;

import java.sql.SQLException;

import model.SongDAO;
import model.dto.SongDTO;
import service.SongServiceImp;
import view.EndView;

public class SongController {

	static SongServiceImp s = SongServiceImp.getInstance();
	
	// 노래 추가 로직
    public static boolean createSong(SongDTO song) {
        try {
            return s.createSong(song);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static void addSong(String artist, String songName, String genre, boolean artType, String url) {
        try {
        	SongDTO song = SongDTO.builder()
                    .artist(artist)
                    .songName(songName)
                    .genre(genre)
                    .artType(artType)
                    .url(url)
                    .build();

            boolean isAdded = SongController.createSong(song);
            
            if (!isAdded) {
                throw new Exception("노래 추가에 실패했습니다.");
            }

            System.out.println("새로운 노래가 추가되었습니다.");

        } catch (Exception e) {
            // 예외 발생 시 실패 메시지 출력
            System.out.println(e.getMessage());
            e.printStackTrace();  // 예외 내용 출력
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
	

}
