package logic.creditcard.validation.validators;

import model.CreditCard;

import java.util.Date;

abstract class AbstractCreditCardValidator implements CreditCardValidator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        String cardNumber = creditCard.getCardNumber();
        return beginsWithCorrectDigit(cardNumber)
                && isCorrectLength(cardNumber)
                && passesCheckDigitValidation(cardNumber);
    }

    @Override
    public boolean isExpired(Date expirationDate) {
        return expirationDate.before(new Date());
    }

    abstract boolean beginsWithCorrectDigit(String cardNumber);

    abstract boolean isCorrectLength(String cardNumber);

    abstract boolean passesCheckDigitValidation(String cardNumber);
}
