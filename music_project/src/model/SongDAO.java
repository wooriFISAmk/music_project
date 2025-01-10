package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.SongDTO;
import model.util.DBUtil;

public class SongDAO {
	
	public static ArrayList<SongDTO> getAllSongs() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<SongDTO> songs = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select *from song");
			rset = pstmt.executeQuery();
			
			songs = new ArrayList<>();
			while(rset.next()) {
				songs.add(SongDTO.builder()
						.songId(rset.getInt(1))
						.artist(rset.getString(2))
						.songName(rset.getString(3))
						.genre(rset.getString(4))
						.artType(rset.getBoolean(5))
						.url(rset.getString(6)).build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);;
		}
		return songs;
	}

}
