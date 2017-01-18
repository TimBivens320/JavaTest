package logic.creditcard.validation;

import logic.creditcard.validation.validators.CreditCardValidator;
import logic.creditcard.validation.validators.MasterCardValidator;
import logic.creditcard.validation.validators.VisaValidator;
import model.enums.CreditCardType;

public class CreditCardValidatorFactory {
    public CreditCardValidator get(CreditCardType creditCardType) {
        if (creditCardType == CreditCardType.VISA) {
            return new VisaValidator();
        } else if (creditCardType == CreditCardType.MASTERCARD) {
            return new MasterCardValidator();
        } else {
            return null;
        }
    }
}
