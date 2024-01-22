package com.manning.javapersistence.ch12.fetchloadgraph;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, User> seller;
	public static volatile SetAttribute<Item, String> images;
	public static volatile SingularAttribute<Item, LocalDate> auctionEnd;
	public static volatile SingularAttribute<Item, String> name;
	public static volatile SetAttribute<Item, Bid> bids;
	public static volatile SingularAttribute<Item, Long> id;

	public static final String SELLER = "seller";
	public static final String IMAGES = "images";
	public static final String AUCTION_END = "auctionEnd";
	public static final String NAME = "name";
	public static final String BIDS = "bids";
	public static final String ID = "id";

}

