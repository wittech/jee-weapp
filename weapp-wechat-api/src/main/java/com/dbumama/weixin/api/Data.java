/**
 * Copyright (c) 广州点步信息科技有限公司 2016-2017, wjun_java@163.com.
 *
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/lgpl-3.0.txt
 *	    http://www.dbumama.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dbumama.weixin.api;

import com.jfinal.kit.StrKit;

/**
 * @author wangjun
 * 2019年2月19日
 */
public class Data {

	private Content content;

	public static Data Builder() {
		return new Data();
	}

	public Data build() {
		if (!StrKit.notNull(content)) {
			throw new IllegalStateException("content is null");
		}
		return new Data(content);
	}

	private Data() {
	}

	private Data(Content content) {
		this.content = content;
	}

	public Content getContent() {
		return content;
	}

	public Data setContent(Content content) {
		this.content = content;
		return this;
	}
	
}
