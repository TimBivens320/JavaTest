package logic.creditcard.validation.validators;

public class MasterCardValidator extends AbstractCreditCardValidator {
    @Override
    boolean beginsWithCorrectDigit(String cardNumber) {
        return cardNumber.startsWith("5");
    }

    @Override
    boolean isCorrectLength(String cardNumber) {
        return cardNumber.length() == 16;
    }
}
