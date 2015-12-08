package com.hanains.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {
	
	public static void forwarding(HttpServletRequest request , HttpServletResponse response, String path)
	throws ServletException, IOException{
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	public static void redirect(HttpServletResponse response, String url) throws ServletException, IOException{
		response.sendRedirect(url);
	}
}
