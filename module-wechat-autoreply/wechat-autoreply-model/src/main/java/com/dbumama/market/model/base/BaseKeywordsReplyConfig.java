package com.dbumama.market.model.base;

import com.dbumama.market.model.gen.WxmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Wxmall, do not modify this file.
 * http://www.dbumama.com
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseKeywordsReplyConfig<M extends BaseKeywordsReplyConfig<M>> extends WxmModel<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setKeywordsId(java.lang.Long keywordsId) {
		set("keywords_id", keywordsId);
		return (M)this;
	}
	
	public java.lang.Long getKeywordsId() {
		return getLong("keywords_id");
	}

	public M setMsgType(java.lang.Integer msgType) {
		set("msg_type", msgType);
		return (M)this;
	}
	
	public java.lang.Integer getMsgType() {
		return getInt("msg_type");
	}

	public M setMsgTextContent(java.lang.String msgTextContent) {
		set("msg_text_content", msgTextContent);
		return (M)this;
	}
	
	public java.lang.String getMsgTextContent() {
		return getStr("msg_text_content");
	}

	public M setMediaId(java.lang.String mediaId) {
		set("media_id", mediaId);
		return (M)this;
	}
	
	public java.lang.String getMediaId() {
		return getStr("media_id");
	}

	public M setMediaPic(java.lang.String mediaPic) {
		set("media_pic", mediaPic);
		return (M)this;
	}
	
	public java.lang.String getMediaPic() {
		return getStr("media_pic");
	}

	public M setAppId(java.lang.String appId) {
		set("app_id", appId);
		return (M)this;
	}
	
	public java.lang.String getAppId() {
		return getStr("app_id");
	}

	public M setAppPath(java.lang.String appPath) {
		set("app_path", appPath);
		return (M)this;
	}
	
	public java.lang.String getAppPath() {
		return getStr("app_path");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
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