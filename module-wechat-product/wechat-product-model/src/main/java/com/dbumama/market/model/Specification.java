package com.dbumama.market.model;

import io.jboot.db.annotation.Table;
import com.dbumama.market.model.base.BaseSpecification;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_specification", primaryKey = "id")
public class Specification extends BaseSpecification<Specification> {
	public static final String table = "t_specification";
	public static final Specification dao = new Specification().dao();
}
