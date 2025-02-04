package song.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import song.model.dto.SongDTO;
import song.model.util.DBUtil;

public class SongDAO {
	// 새로운 노래 추가
	public static boolean createSong(SongDTO song) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into song (artist, song_name, genre, url) values(?, ?, ?, ?)");
			pstmt.setString(1, song.getArtist());
			pstmt.setString(2, song.getSongName());
			pstmt.setString(3, song.getGenre());
			pstmt.setString(4, song.getUrl());

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}

		} finally {
			DBUtil.close(con, pstmt);
		}

		return false;
	}

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
			while (rset.next()) {
				songs.add(SongDTO.builder().songId(rset.getInt(1)).artist(rset.getString(2)).songName(rset.getString(3))
						.genre(rset.getString(4)).url(rset.getString(5)).build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
			;
		}
		return songs;
	}

	// 노래 이름으로 URL 업데이트 메서드
	public static boolean updateUrlBySongNameAndArtist(String songName, String artist, String url) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("UPDATE song SET url = ? WHERE song_name = ? AND artist = ?");
			pstmt.setString(1, url);
			pstmt.setString(2, songName);
			pstmt.setString(3, artist);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	public static ArrayList<SongDTO> getSongsByKeyword(String keyword) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<SongDTO> songs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select *from song where song_name like ? or artist like ?;");
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			rset = pstmt.executeQuery();

			songs = new ArrayList<>();
			while (rset.next()) {
				songs.add(SongDTO.builder().songId(rset.getInt(1)).artist(rset.getString(2)).songName(rset.getString(3))
						.genre(rset.getString(4)).url(rset.getString(5)).build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
			;
		}
		return songs;

	}

	public static boolean deleteSongBySongNameAndArtist(String songName, String artist) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from song where song_name=? and artist=?");
			pstmt.setString(1, songName);
			pstmt.setString(2, artist);
			int result = pstmt.executeUpdate();
			if (result == 1) {

				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;

	}

	public static boolean checkSongBySongNameAndArtist(String songName, String artist) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from song where song_name=? and artist=?");
			pstmt.setString(1, songName);
			pstmt.setString(2, artist);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				return false;
			} else {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
	}

}
