package controller;

import java.sql.SQLException;
import service.SongServiceImp;
import view.EndView;

public class SongController {

    static SongServiceImp s = SongServiceImp.getInstance();

    // 전체 노래 조회 메서드
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
}
