package view;

import java.util.ArrayList;

import model.dto.SongDTO;

public class EndView {
	
	public static void songListView(ArrayList<SongDTO> songs) {
		System.out.println("노래 개수 : " + songs.size());
		songs.stream().forEach(System.out::println);
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}
