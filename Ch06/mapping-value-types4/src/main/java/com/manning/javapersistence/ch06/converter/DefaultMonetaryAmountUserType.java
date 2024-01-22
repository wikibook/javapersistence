package com.manning.javapersistence.ch06.converter;

import com.manning.javapersistence.ch06.model.MonetaryAmount;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.metamodel.spi.ValueAccess;
import org.hibernate.usertype.CompositeUserType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

public abstract class DefaultMonetaryAmountUserType
        implements CompositeUserType<MonetaryAmount> {

    @Override
    public Class<MonetaryAmount> returnedClass() {
        return MonetaryAmount.class;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public MonetaryAmount deepCopy(MonetaryAmount value) {
        return value;
    }

    @Override
    public Serializable disassemble(MonetaryAmount value) {
        return value.toString();
    }

    @Override
    public MonetaryAmount assemble(Serializable cached, Object owner) {
        return MonetaryAmount.fromString((String) cached);
    }

    @Override
    public MonetaryAmount replace(MonetaryAmount original, MonetaryAmount target, Object owner) {
        return original;
    }

    @Override
    public boolean equals(MonetaryAmount x, MonetaryAmount y) {
        return x == y || !(x == null || y == null) && x.equals(y);
    }

    @Override
    public int hashCode(MonetaryAmount x) {
        return x.hashCode();
    }

    @Override
    public Object getPropertyValue(MonetaryAmount component, int property) throws HibernateException {
        return switch (property) {
            case 0 -> component.getCurrency();
            case 1 -> component.getValue();
            default -> throw new HibernateException("Illegal property index: " + property);
        };
    }

    abstract Currency getCurrency();

    @Override
    public MonetaryAmount instantiate(ValueAccess values, SessionFactoryImplementor sessionFactory) {
        final Currency currency = getCurrency();
        final BigDecimal value = values.getValue(1, BigDecimal.class);

        if (value == null && currency == null) {
            return null;
        }


        return new MonetaryAmount(
                value.multiply(new BigDecimal(2)), currency
        );
    }

    @Override
    public Class<MonetaryAmountEmbeddable> embeddable() {
        return MonetaryAmountEmbeddable.class;
    }

    public static class MonetaryAmountEmbeddable {
        private BigDecimal value;
        private Currency currency;
    }

}