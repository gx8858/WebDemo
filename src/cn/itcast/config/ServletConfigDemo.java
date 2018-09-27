package cn.itcast.config;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {

	/**
	 * ServletConfig对象的方法
	 * 1.String getServletName() 		获取配置Servlet的名称（<servlet-name>ServletDemo</servlet-name>） 
	 * 2.String getInitParameter(String name)  	获取初始化参数
 	 * 3.Enumeration getInitParameterNames()  		获取初始化参数
	 *	
	 * 4.ServletContext getServletContext()  		获取ServletContext对象
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 先获得ServletConfig对象
		ServletConfig config = getServletConfig();
		// 操作ServletConfig的方法

		// 获取Servlet配置的名称<servlet-name>ServletConfigDemo</servlet-name>
		String servletName = config.getServletName();
		System.out.println("当前的servlet配置文件的名为" + servletName);

		// 获取初始化参数
		// 可以在配置文件中配置初始化参数
		// 配置初始化参数
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username + " : " + password);
		System.out.println("---------------------------------");

		// 获取初始化参数 Enumeration getInitParameterNames()
		// 如果配置的初始化参数比较多，名称可能不好找，来获取所有的初始化名称
		Enumeration<String> names = config.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			// 获取值
			String value = config.getInitParameter(name);
			System.out.println(name + " : " + value);
		}

		// 获取ServletContext
		ServletContext context = getServletContext();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}