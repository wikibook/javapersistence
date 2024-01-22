package com.manning.javapersistence.ch06.converter;

import java.util.Currency;

public class USDMonetaryAmountUserType extends DefaultMonetaryAmountUserType {
    @Override
    Currency getCurrency() {
        return Currency.getInstance("USD");
    }
}
