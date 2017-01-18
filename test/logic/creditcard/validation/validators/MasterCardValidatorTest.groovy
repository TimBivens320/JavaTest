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

    private static Date getDate(int numberOfDaysToAdd) {
        Calendar calendar = Calendar.getInstance()
        calendar.add(Calendar.DATE, numberOfDaysToAdd)
        return calendar.getTime()
    }
}
