package BookStore.domain;

/**
 * @author victor.
 * The book entity with 4 fields, with getters and setters
 * This entity will be printed and added in the Repository for week 2
 */
public class Book extends BaseEntity<Long> {

    private String title;
    private String author;
    private String genre;
    private Long price;

    public Book() {

    }

    public Book(String iTitle, String iAuthor, String IGenre, Long IPrice) {
        this.title = iTitle;
        this.author = iAuthor;
        this.genre = IGenre;
        this.price = IPrice;

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public Long getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book my_book = (Book) o;

        if (!title.equals(my_book.title)) return false;
        if (!genre.equals(my_book.genre)) return false;
        if (!author.equals(my_book.author)) return false;

        return price.equals(my_book.price);
    }

    @Override
    public String toString() {
        return "" + "Book " + this.title + " with the author " + this.author;
    }
}
