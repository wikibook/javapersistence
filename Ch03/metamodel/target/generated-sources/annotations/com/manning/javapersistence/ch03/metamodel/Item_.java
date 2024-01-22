package com.manning.javapersistence.ch03.metamodel;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(Item.class)
public abstract class Item_ {

	
	/**
	 * @see com.manning.javapersistence.ch03.metamodel.Item#auctionEnd
	 **/
	public static volatile SingularAttribute<Item, Date> auctionEnd;
	
	/**
	 * @see com.manning.javapersistence.ch03.metamodel.Item#name
	 **/
	public static volatile SingularAttribute<Item, String> name;
	
	/**
	 * @see com.manning.javapersistence.ch03.metamodel.Item#id
	 **/
	public static volatile SingularAttribute<Item, Long> id;
	
	/**
	 * @see com.manning.javapersistence.ch03.metamodel.Item
	 **/
	public static volatile EntityType<Item> class_;

	public static final String AUCTION_END = "auctionEnd";
	public static final String NAME = "name";
	public static final String ID = "id";

}

