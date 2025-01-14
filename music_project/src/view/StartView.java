package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import song.controller.SongController;

public class StartView {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "0";
		
		while(!input.equals("-1")) {
			System.out.println("조회:1, 검색:2, 추가:3, 수정:4, 삭제:5, 종료: -1");
			input = br.readLine();
			
			if(input.equals("1")) {
				// 전체 노래 조회
				System.out.println("*** 전체 노래 조회 ***");
				SongController.getAllSongs();
			}else if(input.equals("2")) {
				// 키워드를 통해 노래 검색
				System.out.println("\n*** 키워드로 노래 검색 ***");
				System.out.println("찾고 싶은 노래나 아티스트를 입력해주세요.");
				StringTokenizer st3 = new StringTokenizer(br.readLine(),",");
				SongController.getSongsBySongName(st3.nextToken().trim());
			}else if(input.equals("3")) {
				// 노래 추가하기
				System.out.println("\n*** 노래 추가하기 ***");
				System.out.println("노래 제목, 아티스트, 장르, url 입력해주세요.");
				StringTokenizer st1 = new StringTokenizer(br.readLine(),",");
				SongController.createSong(st1.nextToken().trim(), st1.nextToken().trim(), st1.nextToken().trim(), st1.nextToken().trim());
			}else if(input.equals("4")) {
				// 노래 제목으로 영상 url 수정
				System.out.println("\n***노래 제목으로 url 수정***");
				System.out.println("수정하고 싶은 노래 제목과 아티스트의 새로운 url을 입려해주세요.");
				StringTokenizer st2 = new StringTokenizer(br.readLine(),",");
				SongController.updateUrlBySongNameAndArtist(st2.nextToken().trim(),st2.nextToken().trim(), st2.nextToken().trim());
			}else if(input.equals("5")) {
				// 노래 제목과 아티스트로 노래 삭제
				System.out.println("\n*** 삭제하고 싶은 노래 제목과 아티스트를 입력해주세요. ***");
				StringTokenizer st4 = new StringTokenizer(br.readLine(),",");
				SongController.deleteSongBySongNameAndArtist(st4.nextToken().trim(), st4.nextToken().trim());
			}else if(input.equals("-1")) {
				EndView.showMessage("종료되었습니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
			
		}


	}

}
