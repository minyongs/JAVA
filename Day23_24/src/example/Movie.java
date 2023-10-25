package example;
import java.util.Scanner;
public class Movie {
	private String movieTitle;//영화 제목
	private String movieGrade;//영화 평점
	private String movieDirector;//영화 감독
	private String movieYear;//개봉 연도
	private String movieData;
	//private라서 설정자와 접근자가 필요함
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle; //this. 으로 필드의 값 = 매개변수의 값(실행쪽에서 설정);
	}
	public String getMovieGrade() {
		return movieGrade;
	}
	public void setMovieGrade(String movieGrade) {
		this.movieGrade = movieGrade;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	public void movieData(String title,String grade,String director,String year) {
		movieTitle = title;
		movieGrade = grade;
		movieDirector = director;
		movieYear = year;
	}
	
	public String toString() {
		return String.format("제목: %s, 등급: %s, 감독: %s, 년도: %s");
	}		
	public void inputData(String input){
		 Scanner sc = new Scanner(System.in);

		    System.out.println("제목:");
		    String title = sc.nextLine();
		    System.out.println("등급:");
		    String grade = sc.nextLine();
		    System.out.println("감독:");
		    String director = sc.nextLine();
		    System.out.println("년도:");
		    String year = sc.nextLine();

		    // movieData 메서드를 호출하여 값을 설정
		    movieData(title, grade, director, year);
	}
	



}