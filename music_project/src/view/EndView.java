package view;

import java.util.ArrayList;

import song.model.dto.SongDTO;

public class EndView {
	
	// 노래 목록 조회
	public static void songListView(ArrayList<SongDTO> songs) {
		System.out.println("조회된 노래 개수 : " + songs.size());
		songs.stream().forEach(System.out::println);
	}
	
	// 성공 메시지
	public static void showMessage(String message) {
		System.out.println(message);
	}
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}
