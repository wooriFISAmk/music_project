package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dto.SongDTO;
import model.util.DBUtil;

public class SongDAO {
	
	// 새로운 노래 추가
	public static boolean createSong(SongDTO song) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into song (artist, song_name, genre, art_type, url) values(?, ?, ?, ?, ?)");
			pstmt.setString(1, song.getArtist());
			pstmt.setString(2, song.getSongName());
			pstmt.setString(3, song.getGenre());
			pstmt.setBoolean(4, song.isArtType());
			pstmt.setString(5, song.getUrl());
			
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				return true;
			}
			
		} finally {
			DBUtil.close(con, pstmt);
		}
		
	return false;
	}


}
