package com.dbumama.market.model;

import io.jboot.db.annotation.Table;
import com.dbumama.market.model.base.BaseOrderLog;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_order_log", primaryKey = "id")
public class OrderLog extends BaseOrderLog<OrderLog> {
	public static final String table = "t_order_log";
	public static final OrderLog dao = new OrderLog().dao();
}
