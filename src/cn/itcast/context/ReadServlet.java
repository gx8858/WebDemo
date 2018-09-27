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
		// 读取资源文件的两种方法
		run1();
		// run2();
		// ReadDB readDB = new ReadDB();
		// readDB.read1();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	// 读取资源文件(方法一)
	public void run1() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		// 使用ServletContext对象，因为这里面有两个方法
		/**
		 * InputStream getResourceAsStream(String path) 通过文件的路径获取文件的输入流 String
		 * String getRealPath(String path) 通过文件的路径获取文件的绝对磁盘路径
		 */
		String path = "/WEB-INF/classes/db.properties";
		InputStream in = this.getServletContext().getResourceAsStream(path);
		// 加载文件
		pro.load(in);
		// String username = (String) pro.get("username");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("用户名为：" + username);
		System.out.println("密码为：" + password);
	}

	// 读取资源文件(方法二)
	public void run2() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		String path = "/WEB-INF/classes/cn/itcast/context/db.properties";
		String realPath = this.getServletContext().getRealPath(path);

		// 加载文件
		pro.load(new FileInputStream(realPath));
		// String username = (String) pro.get("username");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("用户名为：" + username);
		System.out.println("密码为：" + password);
	}
}
