package com.dbumama.market.model;

import io.jboot.db.annotation.Table;
import com.dbumama.market.model.base.BaseRefund;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_refund", primaryKey = "id")
public class Refund extends BaseRefund<Refund> {
	public static final String table = "t_refund";
}
