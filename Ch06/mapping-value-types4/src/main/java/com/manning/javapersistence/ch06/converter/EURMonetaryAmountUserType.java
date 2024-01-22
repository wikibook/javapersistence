package com.manning.javapersistence.ch06.converter;

import java.util.Currency;

public class EURMonetaryAmountUserType extends DefaultMonetaryAmountUserType {

    @Override
    Currency getCurrency() {
        return Currency.getInstance("EUR");
    }
}
