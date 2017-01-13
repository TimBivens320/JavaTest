package model

import model.enums.CreditCardType

class CreditCardTest extends GroovyTestCase {
        private CreditCard creditCard

    void setUp() {
        super.setUp()

        creditCard = new CreditCard()
    }

    void testGetCreditCardType() {
        creditCard.creditCardType = CreditCardType.VISA
        assertEquals(CreditCardType.VISA, creditCard.getCreditCardType())
    }

    void testSetCreditCardType() {
        creditCard.setCreditCardType(CreditCardType.MASTERCARD)
        assertEquals(CreditCardType.MASTERCARD, creditCard.creditCardType)
    }

    void testGetCardNumber() {
        creditCard.cardNumber = "12345"
        assertEquals("12345", creditCard.getCardNumber())
    }

    void testSetCardNumber() {
        creditCard.setCardNumber("98765")
        assertEquals("98765", creditCard.cardNumber)
    }

    void testGetExpirationDate() {
        creditCard.expirationDate = new Date(2017, 1, 3)
        assertEquals(new Date(2017, 1, 3), creditCard.getExpirationDate())
    }

    void testSetExpirationDate() {
        creditCard.setExpirationDate(new Date(2016, 12, 15))
        assertEquals(new Date(2016, 12, 15), creditCard.expirationDate)
    }

    void testGetCardholderName() {
        creditCard.cardholderName = "test name"
        assertEquals("test name", creditCard.getCardholderName())
    }

    void testSetCardholderName() {
        creditCard.setCardholderName("another person")
        assertEquals("another person", creditCard.cardholderName)
    }

    void testGetSecurityCode() {
        creditCard.securityCode = "987"
        assertEquals("987", creditCard.getSecurityCode())
    }

    void testSetSecurityCode() {
        creditCard.setSecurityCode("123")
        assertEquals("123", creditCard.securityCode)
    }
}
