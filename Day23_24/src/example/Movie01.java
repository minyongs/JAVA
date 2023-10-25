package example;
import java.util.Scanner;
public class Movie01 {
public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
//main에서 인스턴스 생성, 받아오기
	}

	public static void inputData(Movie mv) {//Movie mv = 주소
		System.out.print("영화 제목: ");
		mv.setMovieTitle(input.nextLine());
		System.out.print("영화 등급: ");
		mv.setMovieGrade(input.nextLine());
		System.out.print("영화 감독: ");
		mv.setMovieDirector(input.nextLine());
		System.out.print("발표 연도: ");
		mv.setMovieYear(input.nextLine());
		
	}
}
