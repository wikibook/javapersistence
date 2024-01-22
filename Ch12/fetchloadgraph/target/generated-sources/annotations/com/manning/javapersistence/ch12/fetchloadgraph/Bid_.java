package com.manning.javapersistence.ch12.fetchloadgraph;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bid.class)
public abstract class Bid_ {

	public static volatile SingularAttribute<Bid, Item> item;
	public static volatile SingularAttribute<Bid, BigDecimal> amount;
	public static volatile SingularAttribute<Bid, User> bidder;
	public static volatile SingularAttribute<Bid, Long> id;

	public static final String ITEM = "item";
	public static final String AMOUNT = "amount";
	public static final String BIDDER = "bidder";
	public static final String ID = "id";

}

