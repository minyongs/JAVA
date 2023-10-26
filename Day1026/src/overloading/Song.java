package overloading;

public class Song {
	//멤버 변수
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}

	public String[] getComposer() {
		return composer;
	}
	public void setComposer(String[] composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public Song() {
	}
	public Song(String title,String album,String artist,String[] composer,int year,int track) {
	this.title =title;
	this.album = album;
	this.artist = artist;
	this.composer=composer;
	this.year = year;
	this.track = track; 
	
	
		
	}
	public void show() {
		System.out.println("노래 제목:"+title);
		System.out.println("앨범:"+album);
		System.out.println("가수:"+artist);
		System.out.println("작곡가:"+composer);
		System.out.println("트랙 번호:"+track);
		System.out.println("발매 년도:"+year);
		
		
	}

}
