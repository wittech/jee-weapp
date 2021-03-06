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
package com.dbumama.market.web.core.ueditor.controller;

import com.dbumama.market.web.core.interceptor.CSRFInterceptor;
import com.dbumama.market.web.core.ueditor.ActionEnter;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;

/**
 * @author wangjun
 * 2017年7月10日
 */
@Clear(CSRFInterceptor.class)
public class UeditorApiController extends Controller{
	public void index() {
		String outText = ActionEnter.me().exec(getRequest());
		renderHtml(outText);
	}
}

