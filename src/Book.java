import java.util.Objects;

public class Book {
    private String bookName;
    private final Author author;
    private int yearOfPublication;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public String toString() {
        System.out.println("Название книги: " + bookName);
        System.out.println("Автор книги: " + author);
        return "Год публикации: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearOfPublication == book.yearOfPublication && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublication);
    }
}

