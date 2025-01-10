package controller;

import java.sql.SQLException;
import model.SongDAO;
import model.dto.SongDTO;
import service.SongServiceImp;
import view.EndView;

public class SongController {

    static SongServiceImp s = SongServiceImp.getInstance();

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

    // 새로운 노래 추가 메서드
    public static boolean createSong(SongDTO song) {
        boolean result = false;
        try {
            result = SongDAO.createSong(song);
        } catch (SQLException e) {
            e.printStackTrace();
            EndView.showError("노래 추가 오류");
        }
        return result;
    }
}
