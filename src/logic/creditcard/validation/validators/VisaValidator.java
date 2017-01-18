package logic.creditcard.validation.validators;

public class VisaValidator extends AbstractCreditCardValidator {
    @Override
    boolean beginsWithCorrectDigit(String cardNumber) {
        return cardNumber.startsWith("4");
    }

    @Override
    boolean isCorrectLength(String cardNumber) {
        return cardNumber.length() == 16;
    }

    @Override
    boolean passesCheckDigitValidation(String cardNumber) {
        return false;
    }
}