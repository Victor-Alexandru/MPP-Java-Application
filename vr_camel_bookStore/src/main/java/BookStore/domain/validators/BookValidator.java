package BookStore.domain.validators;

import BookStore.domain.Book;

import java.util.List;

/*
* Created by Victor,to validate a book,
* TO DO: Create Custom Exception for the Validators
*
*
* */
public class BookValidator implements Validator<Book> {
    private List<String> genres = List.of("drama", "romance",  "action", "adventure", "horror");

    @Override
    public void validate(Book entity) throws ValidatorException {
        boolean idExists = this.genres.stream()
                .anyMatch(t->t.equals(entity.getGenre()));
        if (!idExists)
        {
            /* here Someone needs to throw an Exception */
            System.out.println("You can not assign this genre");
        }

        if (entity.getPrice() < 0)
        {
            /* Someone also needs to check if the price is a string */
            /* here Someone needs to throw an Exception */
            System.out.println("Price needs to be  greater than 0");
        }
        /* In the Ui u need to validate so that the author string does not contain a digit*/


    }
}
