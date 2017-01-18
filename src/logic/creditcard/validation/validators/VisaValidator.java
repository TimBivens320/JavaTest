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
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}