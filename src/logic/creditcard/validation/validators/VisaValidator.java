package logic.creditcard.validation.validators;

import model.CreditCard;

public class VisaValidator extends AbstractCreditCardValidator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}