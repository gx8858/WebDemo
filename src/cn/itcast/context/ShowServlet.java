package cn.itcast.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取值显示到页面上
 * @author AOCNPD
 *
 */
public class ShowServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		Integer count = (Integer) context.getAttribute("count");
		
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
