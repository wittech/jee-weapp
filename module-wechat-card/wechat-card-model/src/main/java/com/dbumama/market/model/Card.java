package com.dbumama.market.model;

import com.dbumama.market.model.base.BaseCard;
import io.jboot.db.annotation.Table;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_card", primaryKey = "id")
public class Card extends BaseCard<Card> {
	public static final String table = "t_card";
	public static final Card dao = new Card().dao();
}
