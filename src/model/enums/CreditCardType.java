package model.enums;

import java.util.Objects;

public enum CreditCardType {
    VISA ("Visa", "V"),
    MASTERCARD ("MasterCard", "MC");

    private final String _name;
    private final String _abbreviation;

    public String get_name() {
        return _name;
    }

    public String get_abbreviation() {
        return _abbreviation;
    }

    CreditCardType(String name, String abbreviation) {
        this._name = name;
        this._abbreviation = abbreviation;
    }

    public static CreditCardType get(String abbreviation) {
        for (CreditCardType creditCardType : CreditCardType.values()) {
            if (Objects.equals(creditCardType._abbreviation, abbreviation.toUpperCase())) {
                return creditCardType;
            }
        }

        return null;
    }
}
