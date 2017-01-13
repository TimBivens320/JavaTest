package model;

import model.enums.CreditCardType;

import java.util.Date;

public class CreditCard {
    private CreditCardType _creditCardType;
    private String _cardNumber;
    private Date _expirationDate;
    private String _cardholderName;
    private String _securityCode;

    public CreditCardType get_creditCardType() {
        return _creditCardType;
    }

    public void set_creditCardType(CreditCardType _creditCardType) {
        this._creditCardType = _creditCardType;
    }

    public String get_cardNumber() {
        return _cardNumber;
    }

    public void set_cardNumber(String _cardNumber) {
        this._cardNumber = _cardNumber;
    }

    public Date get_expirationDate() {
        return _expirationDate;
    }

    public void set_expirationDate(Date _expirationDate) {
        this._expirationDate = _expirationDate;
    }

    public String get_cardholderName() {
        return _cardholderName;
    }

    public void set_cardholderName(String _cardholderName) {
        this._cardholderName = _cardholderName;
    }

    public String get_securityCode() {
        return _securityCode;
    }

    public void set_securityCode(String _securityCode) {
        this._securityCode = _securityCode;
    }
}
