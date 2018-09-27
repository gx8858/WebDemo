package cn.itcast.context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ��ȡ��Դ�ļ������ַ���
		run1();
		// run2();
		// ReadDB readDB = new ReadDB();
		// readDB.read1();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	// ��ȡ��Դ�ļ�(����һ)
	public void run1() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		// ʹ��ServletContext������Ϊ����������������
		/**
		 * InputStream getResourceAsStream(String path) ͨ���ļ���·����ȡ�ļ��������� String
		 * String getRealPath(String path) ͨ���ļ���·����ȡ�ļ��ľ��Դ���·��
		 */
		String path = "/WEB-INF/classes/db.properties";
		InputStream in = this.getServletContext().getResourceAsStream(path);
		// �����ļ�
		pro.load(in);
		// String username = (String) pro.get("username");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("�û���Ϊ��" + username);
		System.out.println("����Ϊ��" + password);
	}

	// ��ȡ��Դ�ļ�(������)
	public void run2() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		String path = "/WEB-INF/classes/cn/itcast/context/db.properties";
		String realPath = this.getServletContext().getRealPath(path);

		// �����ļ�
		pro.load(new FileInputStream(realPath));
		// String username = (String) pro.get("username");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("�û���Ϊ��" + username);
		System.out.println("����Ϊ��" + password);
	}
}
