package model.enums

class CreditCardTypeTest extends GroovyTestCase {
    void testGet_name() {
        assertEquals("Visa", CreditCardType.VISA.get_name())
        assertEquals("MasterCard", CreditCardType.MASTERCARD.get_name())
    }

    void testGet_abbreviation() {
        assertEquals("V", CreditCardType.VISA.get_abbreviation())
        assertEquals("MC", CreditCardType.MASTERCARD.get_abbreviation())
    }

    void testGet() {
        assertEquals(CreditCardType.VISA, CreditCardType.get("V"))
        assertEquals(CreditCardType.MASTERCARD, CreditCardType.get("MC"))
        assertEquals(null, CreditCardType.get("ZZ"))
    }

    void testGetLowerCase() {
        assertEquals(CreditCardType.VISA, CreditCardType.get("v"))
        assertEquals(CreditCardType.MASTERCARD, CreditCardType.get("mc"))
    }
}
