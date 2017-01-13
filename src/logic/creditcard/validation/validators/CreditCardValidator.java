package logic.creditcard.validation.validators;

import model.CreditCard;

import java.util.Date;

public interface CreditCardValidator {
    boolean isValid(CreditCard creditCard);

    boolean isExpired(Date expirationDate);
}
