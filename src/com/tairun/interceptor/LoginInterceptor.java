package com.tairun.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.tairun.bean.User;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
	

	}

	@Override
	public void init() {
	

	}

	@Override
	public String intercept(ActionInvocation invocation)
			throws Exception {
		HttpSession session = ServletActionContext
				.getRequest().getSession();
		User user = (User)session.getAttribute("user");
		HttpServletRequest request = ServletActionContext.getRequest();
		 String url = request.getRequestURI();
		 System.out.println(url);
		if(user!=null){
		return invocation.invoke();
		}else{
			//user == null
			if(url.contains("login")){
				return invocation.invoke();
			}else{
			return "relogin";
			}
		}
	}

}
