public class Book {
    private String nameBook;
    private int yearOfPublicationBook;
    private Author author;

    public String toString() {
        return nameBook + " " + author + " " + yearOfPublicationBook;
    }
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() !=other.getClass()) {
            return false;
        }
        Book nameBook=(Book) other;
        return nameBook.equals(nameBook.nameBook) && author.equals(nameBook.author) && yearOfPublicationBook== nameBook.yearOfPublicationBook;
    }
    public int hashCode() {
        return java.util.Objects.hash(nameBook, author, yearOfPublicationBook);
    }

    public Book(String nameBook, Author author, int yearOfPublicationBook) {

        this.author = author;
        this.nameBook = nameBook;
        this.yearOfPublicationBook = yearOfPublicationBook;
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

