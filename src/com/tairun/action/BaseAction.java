package com.tairun.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseAction {
    Gson gson = new GsonBuilder()
    .setDateFormat("yyyy-MM-dd HH:mm:ss").create();
   
    HttpSession session = ServletActionContext.getRequest().getSession();
    
    public void writeStr(String str ){
    	HttpServletResponse response = ServletActionContext.getResponse();
    	response.setCharacterEncoding("utf-8");
    	try {
			PrintWriter out = response.getWriter();
			out.write(str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    }
}
