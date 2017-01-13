package logic.creditcard.validation

import logic.creditcard.validation.validators.MasterCardValidator
import logic.creditcard.validation.validators.VisaValidator
import model.enums.CreditCardType

class CreditCardValidatorFactoryTest extends GroovyTestCase {
    void testGet() {
        assertEquals(VisaValidator.class, CreditCardValidatorFactory.get(CreditCardType.VISA).class)
        assertEquals(MasterCardValidator.class, CreditCardValidatorFactory.get(CreditCardType.MASTERCARD).class)
        assertNull(CreditCardValidatorFactory.get(null))
     }
}
