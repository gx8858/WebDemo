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
	 * ServletConfig����ķ���
	 * 1.String getServletName() 		��ȡ����Servlet�����ƣ�<servlet-name>ServletDemo</servlet-name>�� 
	 * 2.String getInitParameter(String name)  	��ȡ��ʼ������
 	 * 3.Enumeration getInitParameterNames()  		��ȡ��ʼ������
	 *	
	 * 4.ServletContext getServletContext()  		��ȡServletContext����
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// �Ȼ��ServletConfig����
		ServletConfig config = getServletConfig();
		// ����ServletConfig�ķ���

		// ��ȡServlet���õ�����<servlet-name>ServletConfigDemo</servlet-name>
		String servletName = config.getServletName();
		System.out.println("��ǰ��servlet�����ļ�����Ϊ" + servletName);

		// ��ȡ��ʼ������
		// �����������ļ������ó�ʼ������
		// ���ó�ʼ������
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username + " : " + password);
		System.out.println("---------------------------------");

		// ��ȡ��ʼ������ Enumeration getInitParameterNames()
		// ������õĳ�ʼ�������Ƚ϶࣬���ƿ��ܲ����ң�����ȡ���еĳ�ʼ������
		Enumeration<String> names = config.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			// ��ȡֵ
			String value = config.getInitParameter(name);
			System.out.println(name + " : " + value);
		}

		// ��ȡServletContext
		ServletContext context = getServletContext();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}