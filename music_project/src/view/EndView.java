package view;

import java.util.ArrayList;

import model.dto.SongDTO;

public class EndView {
	
	public static void songListView(ArrayList<SongDTO> songs) {
		for(SongDTO song : songs) {
			System.out.println(song);
		}
	}
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}
