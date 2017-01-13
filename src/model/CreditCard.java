package model;

import model.enums.CreditCardType;

import java.util.Date;

public class CreditCard {
    private CreditCardType creditCardType;
    private String cardNumber;
    private Date expirationDate;
    private String cardholderName;
    private String securityCode;

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType _creditCardType) {
        this.creditCardType = _creditCardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String _cardNumber) {
        this.cardNumber = _cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date _expirationDate) {
        this.expirationDate = _expirationDate;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String _cardholderName) {
        this.cardholderName = _cardholderName;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String _securityCode) {
        this.securityCode = _securityCode;
    }
}
