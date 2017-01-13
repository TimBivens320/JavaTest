package logic.creditcard.validation.validators;

import model.CreditCard;

import java.util.Date;

abstract class AbstractCreditCardValidator implements CreditCardValidator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

    @Override
    public boolean isExpired(Date expirationDate) {
        return expirationDate.before(new Date());
    }
}
