package com.tairun.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ModelDriven;
import com.tairun.bean.User;
import com.tairun.service.UserService;

public class UserAction extends  BaseAction implements ModelDriven<User>{
	 User user = new User();
	 @Resource
	 UserService userService;
	 
   public void login() throws IOException{
	   
	   User user1 = userService.login(user);
	   Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss")
			   .create();
	   String message ="fail";
	   if(user1 != null){
		   
		   session.setAttribute("user", user1);
		   message = "success";
	   }
	   Map<String,String> map  = new HashMap<String,String>();
	   map.put("message", message);
	   HttpServletResponse response = ServletActionContext.getResponse();
	   PrintWriter out = response.getWriter();
	   String json = gson.toJson(map);
	   out.write(json);
   }
   
   public void getUser(){
	   
	   User user =(User) session.getAttribute("user");
	   User user1 = new User();
	   String result = "";
	   if(user == null){
		   user1.setU_username("no");
		  result = gson.toJson(user1);
	   }else{
		   result = gson.toJson(user);
		   
	   }
	   writeStr(result);
   }
   
   
   public void register(){
	   userService.register(user);
	   Map<String,String> map = new HashMap<String,String>();
	   map.put("message", "success");
	   String result = gson.toJson(map);
	   writeStr(result);
   }

   public void logout(){
	   session.removeAttribute("user");
	   Map<String,String> map = new HashMap<String,String>();
	   map.put("message", "success");
	   String result = gson.toJson(map);
	   writeStr(result);
   }
   
@Override
public User getModel() {

	return user;
}
}
