package logic.creditcard.validation;

import logic.creditcard.validation.validators.CreditCardValidator;
import logic.creditcard.validation.validators.MasterCardValidator;
import logic.creditcard.validation.validators.VisaValidator;
import model.CreditCard;

public class CreditCardValidatorFactory {
    public static CreditCardValidator get(CreditCard creditCard) {
        switch (creditCard.getCreditCardType()) {
            case VISA:
                return new VisaValidator();
            case MASTERCARD:
                return new MasterCardValidator();
            default:
                return null;
        }
    }
}
