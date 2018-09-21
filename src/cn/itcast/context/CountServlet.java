package cn.itcast.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ServletContext��ȡֵ���ٴ���ֵ
 * @author AOCNPD
 *
 */
public class CountServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// ��ServletContext�����д���һ����������ʼ��ֵ��0
		ServletContext context = getServletContext();
		// ����һ������
		context.setAttribute("count", 0);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ��context��ȡcount, Ŀ�ģ����� �����ȥ
		ServletContext context = getServletContext();
		// �������ȡ������
		Integer count = (Integer) context.getAttribute("count");
		// ��count����
		count ++;
		// ����ֵ
		context.setAttribute("count", count);
//		resp.getWriter().print(count);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
