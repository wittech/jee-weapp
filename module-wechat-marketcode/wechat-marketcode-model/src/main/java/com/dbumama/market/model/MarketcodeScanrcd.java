package com.dbumama.market.model;

import io.jboot.db.annotation.Table;
import com.dbumama.market.model.base.BaseMarketcodeScanrcd;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings("serial")
@Table(tableName = "t_marketcode_scanrcd", primaryKey = "id")
public class MarketcodeScanrcd extends BaseMarketcodeScanrcd<MarketcodeScanrcd> {
	public static final String table = "t_marketcode_scanrcd";
	public static final MarketcodeScanrcd dao = new MarketcodeScanrcd().dao();
}
