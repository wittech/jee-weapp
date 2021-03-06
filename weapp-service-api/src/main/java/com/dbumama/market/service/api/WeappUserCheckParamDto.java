package com.dbumama.market.service.api;

import com.dbumama.market.service.common.AbstractParamDto;
/**
 * https://mp.weixin.qq.com/debug/wxadoc/dev/api/signature.html
 * 参照小程序文档
 * 用户数据的签名验证和加解密
 * @author wangjun
 *
 */
@SuppressWarnings("serial")
public class WeappUserCheckParamDto extends AbstractParamDto{

	private String sessionKey;
	private String signature;
	private String rawData;
	private String encryptedData;
	private String iv;
	
	public WeappUserCheckParamDto(String sessionKey, String signature, String rawData, String encryptedData,
			String iv) {
		super();
		this.sessionKey = sessionKey;
		this.signature = signature;
		this.rawData = rawData;
		this.encryptedData = encryptedData;
		this.iv = iv;
	}
	
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getRawData() {
		return rawData;
	}
	public void setRawData(String rawData) {
		this.rawData = rawData;
	}
	public String getEncryptedData() {
		return encryptedData;
	}
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}
	public String getIv() {
		return iv;
	}
	public void setIv(String iv) {
		this.iv = iv;
	}
	
}
