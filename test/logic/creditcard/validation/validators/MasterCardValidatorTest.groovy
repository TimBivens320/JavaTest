package logic.creditcard.validation.validators

class MasterCardValidatorTest extends GroovyTestCase {
    protected MasterCardValidator validator

    void setUp() {
        super.setUp()

        validator = new MasterCardValidator()
    }

    void testIsValid() {

    }

    void testIsExpired() {
        assertTrue(validator.isExpired(getDate(-1)))
        assertFalse(validator.isExpired(getDate(0)))
        assertFalse(validator.isExpired(getDate(1)))
    }

    void testBeginsWithCorrectDigit() {
        assertTrue(validator.beginsWithCorrectDigit("512345"))
        assertFalse(validator.beginsWithCorrectDigit("412345"))
    }

    void testIsCorrectLength() {
        assertTrue(validator.isCorrectLength("1234567890123456"))
        assertFalse(validator.beginsWithCorrectDigit("123456789012345"))
    }

    private static Date getDate(int numberOfDaysToAdd) {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.DATE, numberOfDaysToAdd)
        return calendar.getTime()
    }
}
