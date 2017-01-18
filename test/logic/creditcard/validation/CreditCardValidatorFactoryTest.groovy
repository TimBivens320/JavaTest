package logic.creditcard.validation

import logic.creditcard.validation.validators.MasterCardValidator
import logic.creditcard.validation.validators.VisaValidator
import model.enums.CreditCardType

class CreditCardValidatorFactoryTest extends GroovyTestCase {
    protected CreditCardValidatorFactory factory

    void setUp() {
        super.setUp()

        factory = new CreditCardValidatorFactory()
    }

    void testGet() {
        assertEquals(VisaValidator.class, factory.get(CreditCardType.VISA).class)
        assertEquals(MasterCardValidator.class, factory.get(CreditCardType.MASTERCARD).class)
        assertNull(factory.get(null))
     }
}
