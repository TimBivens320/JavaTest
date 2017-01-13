package logic.creditcard.validation.validators;

import model.CreditCard;

public interface CreditCardValidator {
    boolean isValid(CreditCard creditCard);
}
