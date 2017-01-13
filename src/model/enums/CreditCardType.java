package model.enums;

import java.util.Objects;

public enum CreditCardType {
    VISA ("Visa", "V"),
    MASTERCARD ("MasterCard", "MC");

    private final String name;
    private final String abbreviation;

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    CreditCardType(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public static CreditCardType get(String abbreviation) {
        for (CreditCardType creditCardType : CreditCardType.values()) {
            if (Objects.equals(creditCardType.abbreviation, abbreviation.toUpperCase())) {
                return creditCardType;
            }
        }

        return null;
    }
}
