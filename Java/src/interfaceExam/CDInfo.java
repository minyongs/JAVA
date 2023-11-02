package interfaceExam;

public class CDInfo {
    public int registerNo;
    public String title;

   

    public CDInfo(int registerNo, String title) {
        this.registerNo = registerNo;
        this.title = title;
    }
}

class AppCDInfo extends CDInfo {
    public AppCDInfo(int registerNo, String title) {
		super(registerNo, title);
		
	}

	public String borrower;
    public String checkOutDate;
    public String state;

    public void borrowCD() {
        System.out.println("CD가 대출되었습니다");
    }

    public void returnCD() {
        System.out.println("CD가 반납되었습니다");
    }
}

class MusicCDInfo extends CDInfo {
    public String artist;
    public String[] songTitle;

    

    public MusicCDInfo(int registerNo, String title, String artist, String[] songTitle) {
        super(registerNo, title);
        this.artist = artist;
        this.songTitle = songTitle;
    }
}

class SeparateVolume {
    public int requestNo;
    public String bookTitle;
    public String writer;
    public String borrower;
    public String checkOutDate;
    public String state;

    public SeparateVolume(int requestNo, String bookTitle, String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }
}


interface Lendable {
    void checkOut(String borrower, String date);
    void checkIn();
}