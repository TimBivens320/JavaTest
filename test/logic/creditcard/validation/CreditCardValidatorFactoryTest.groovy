package logic.creditcard.validation

import logic.creditcard.validation.validators.MasterCardValidator
import logic.creditcard.validation.validators.VisaValidator
import model.CreditCard
import model.enums.CreditCardType

class CreditCardValidatorFactoryTest extends GroovyTestCase {
    void testGet() {
        assertEquals(VisaValidator.class, CreditCardValidatorFactory.get(setupCreditCard(CreditCardType.VISA)).class)
        assertEquals(MasterCardValidator.class, CreditCardValidatorFactory.get(setupCreditCard(CreditCardType.MASTERCARD)).class)
     }

    private static CreditCard setupCreditCard(CreditCardType creditCardType) {
        return new CreditCard() {{
            setCreditCardType(creditCardType)
        }}
    }
}
