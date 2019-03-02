package BookStore.domain.validators;

import BookStore.domain.validators.ValidatorException;

/*
    Added by victor
 */
public interface Validator<T> {
    void validate(T entity) throws ValidatorException;
}
