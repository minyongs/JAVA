package exam_class_extends_check;
class Book{
	private String title;
	private int pages;
	private String writer;
	
	public Book(String title, int pages, String writer) {//생성자로 초기화
		this.title = title;
		this.pages = pages;
		this.writer = writer;// 매개변수와 객체가 같아서 .this
		
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String toString() {
		return"제목:"+title+"\n페이지수 :"+ pages +"\n 저자"+ writer;
	}
	
	
}


