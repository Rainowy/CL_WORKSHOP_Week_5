package pl.coderslab.model;

public interface Book {

    long getId();
    String getIsbn();
    String getTitle();
    String getPublisher();
    BookType getType();
    String getAuthor();

}
