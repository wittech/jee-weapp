package com.dbumama.market.model.base;

import com.dbumama.market.model.gen.WxmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMenuNotifyConfig<M extends BaseMenuNotifyConfig<M>> extends WxmModel<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setAppId(java.lang.Long appId) {
		set("app_id", appId);
		return (M)this;
	}
	
	public java.lang.Long getAppId() {
		return getLong("app_id");
	}

	public M setNotifyerId(java.lang.Long notifyerId) {
		set("notifyer_id", notifyerId);
		return (M)this;
	}
	
	public java.lang.Long getNotifyerId() {
		return getLong("notifyer_id");
	}

	public M setMenuKey(java.lang.String menuKey) {
		set("menu_key", menuKey);
		return (M)this;
	}
	
	public java.lang.String getMenuKey() {
		return getStr("menu_key");
	}

	public M setCreated(java.util.Date created) {
		set("created", created);
		return (M)this;
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public M setUpdated(java.util.Date updated) {
		set("updated", updated);
		return (M)this;
	}
	
	public java.util.Date getUpdated() {
		return get("updated");
	}

	public M setActive(java.lang.Boolean active) {
		set("active", active);
		return (M)this;
	}
	
	public java.lang.Boolean getActive() {
		return get("active");
	}

}
