package com.dbumama.market.model.base;

import com.dbumama.market.model.gen.WxmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseShop<M extends BaseShop<M>> extends WxmModel<M> implements IBean {

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

	public M setAreaId(java.lang.Long areaId) {
		set("area_id", areaId);
		return (M)this;
	}
	
	public java.lang.Long getAreaId() {
		return getLong("area_id");
	}

	public M setShopName(java.lang.String shopName) {
		set("shop_name", shopName);
		return (M)this;
	}
	
	public java.lang.String getShopName() {
		return getStr("shop_name");
	}

	public M setShopLogo(java.lang.String shopLogo) {
		set("shop_logo", shopLogo);
		return (M)this;
	}
	
	public java.lang.String getShopLogo() {
		return getStr("shop_logo");
	}

	public M setShopSign(java.lang.String shopSign) {
		set("shop_sign", shopSign);
		return (M)this;
	}
	
	public java.lang.String getShopSign() {
		return getStr("shop_sign");
	}

	public M setShopContact(java.lang.String shopContact) {
		set("shop_contact", shopContact);
		return (M)this;
	}
	
	public java.lang.String getShopContact() {
		return getStr("shop_contact");
	}

	public M setShopContactPhone(java.lang.String shopContactPhone) {
		set("shop_contact_phone", shopContactPhone);
		return (M)this;
	}
	
	public java.lang.String getShopContactPhone() {
		return getStr("shop_contact_phone");
	}

	public M setShopAddress(java.lang.String shopAddress) {
		set("shop_address", shopAddress);
		return (M)this;
	}
	
	public java.lang.String getShopAddress() {
		return getStr("shop_address");
	}

	public M setLat(java.lang.String lat) {
		set("lat", lat);
		return (M)this;
	}
	
	public java.lang.String getLat() {
		return getStr("lat");
	}

	public M setLng(java.lang.String lng) {
		set("lng", lng);
		return (M)this;
	}
	
	public java.lang.String getLng() {
		return getStr("lng");
	}

	public M setPhotos(java.lang.String photos) {
		set("photos", photos);
		return (M)this;
	}
	
	public java.lang.String getPhotos() {
		return getStr("photos");
	}

	public M setActive(java.lang.Boolean active) {
		set("active", active);
		return (M)this;
	}
	
	public java.lang.Boolean getActive() {
		return get("active");
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

}