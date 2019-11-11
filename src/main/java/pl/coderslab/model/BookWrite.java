package pl.coderslab.model;

public class BookWrite implements Book {

    private long id;

    private String isbn;

    private String title;

    private String author;

    private String publisher;

    private BookType type;


    public long getId() {
        return id;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public BookType getType() {
        return type;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public BookWrite(long id, String isbn, String title, String author, String publisher, BookType type) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }
}
