public class Book {
    private String nameBook;
    private int yearOfPublicationBook;

    private Author author;

    public Book(String nameBook, Author author, int yearOfPublicationBook) {

        this.author = author;
        this.nameBook = nameBook;
        this.yearOfPublicationBook = yearOfPublicationBook;
    }

    public String toString() {
        return nameBook + " " + author + " " + yearOfPublicationBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublicationBook() {
        return yearOfPublicationBook;
    }

    public int setYearOfPublicationBook(int yearOfPublicationBook) {
        this.yearOfPublicationBook = yearOfPublicationBook;
        return yearOfPublicationBook;
    }
}

