package overloading;

public class Book {
    String title;
    String author;

    public Book() {
        this("", "");
    }

    public Book(String title) {
        this(title, "작자미상");
        System.out.print("매개변수가 하나인 생성자");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
}}
