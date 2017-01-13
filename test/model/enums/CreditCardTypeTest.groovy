package model.enums

class CreditCardTypeTest extends GroovyTestCase {
    void testGetName() {
        assertEquals("Visa", CreditCardType.VISA.getName())
        assertEquals("MasterCard", CreditCardType.MASTERCARD.getName())
    }

    void testGetAbbreviation() {
        assertEquals("V", CreditCardType.VISA.getAbbreviation())
        assertEquals("MC", CreditCardType.MASTERCARD.getAbbreviation())
    }

    void testGet() {
        assertEquals(CreditCardType.VISA, CreditCardType.get("V"))
        assertEquals(CreditCardType.MASTERCARD, CreditCardType.get("MC"))
        assertNull(CreditCardType.get("ZZ"))
    }

    void testGetLowerCase() {
        assertEquals(CreditCardType.VISA, CreditCardType.get("v"))
        assertEquals(CreditCardType.MASTERCARD, CreditCardType.get("mc"))
    }
}
