package com.dbumama.market.model;

import io.jboot.db.annotation.Table;
import com.dbumama.market.model.base.BasePromotionSet;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_promotion_set", primaryKey = "id")
public class PromotionSet extends BasePromotionSet<PromotionSet> {
	public static final String table = "t_promotion_set";
	public static final PromotionSet dao = new PromotionSet().dao();
}
