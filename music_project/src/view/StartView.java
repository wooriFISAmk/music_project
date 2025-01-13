package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import controller.SongController;

public class StartView {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 전체 노래 조회
		System.out.println("*** 전체 노래 조회 ***");
		SongController.getAllSongs();
		
		// 노래 추가하기
		System.out.println("\n*** 노래 추가하기 ***");
		System.out.println("노래 제목, 아티스트, 장르, url 입려해주세요.");
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		SongController.addSong(st1.nextToken(), st1.nextToken(), st1.nextToken(), st1.nextToken());
				
		// 노래 제목으로 영상 url 수정
		System.out.println("\n***노래 제목으로 url 수정***");
		System.out.println("수정하고 싶은 노래 제목과 아티스트의 새로운 url을 입려해주세요.");
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		SongController.updateUrlBySongNameAndArtist(st2.nextToken(),st2.nextToken(), st2.nextToken());
		
		// 키워드를 통해 노래 검색
		System.out.println("\n*** 키워드로 노래 검색 ***");
		System.out.println("찾고 싶은 노래나 아티스트를 입력해주세요.");
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		SongController.getSongsBySongName(st3.nextToken());
		
		// 노래 제목과 아티스트로 노래 삭제
		System.out.println("\n*** 삭제하고 싶은 노래 제목과 아티스트를 입력해주세요. ***");
		StringTokenizer st4 = new StringTokenizer(br.readLine());
		SongController.deleteSongBySongNameAndArtist(st4.nextToken(), st4.nextToken());

	}

}
