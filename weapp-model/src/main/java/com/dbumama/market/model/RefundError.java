package com.dbumama.market.model;

import io.jboot.db.annotation.Table;
import com.dbumama.market.model.base.BaseRefundError;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_refund_error", primaryKey = "id")
public class RefundError extends BaseRefundError<RefundError> {
	public static final String table = "t_refund_error";
}