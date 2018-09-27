package cn.itcast.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 向ServletContext获取值，再存入值
 * 
 * @author AOCNPD
 * 
 */
public class CountServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// 向ServletContext对象中存入一个变量，初始化值是0
		ServletContext context = getServletContext();
		// 设置一个变量
		context.setAttribute("count", 0);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 从context获取count, 目的：自增 存入进去
		ServletContext context = getServletContext();
		// 从域对象取出变量
		Integer count = (Integer) context.getAttribute("count");
		// 让count自增
		count++;
		// 存入值
		context.setAttribute("count", count);
		// 显示到页面上
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().print("该网站一共被访问了" + count + "次");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
