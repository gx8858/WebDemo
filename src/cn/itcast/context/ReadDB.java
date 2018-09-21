package cn.itcast.context;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 普通的一个类，没有ServletContext对象
 */
public class ReadDB {

	public void read1() throws IOException {
		// 获取类的加载器，通过class对象
		// 只能写相对路径
		// 只能读取src目录下的内容
		// getClassLoader()相当于到classes这一层目录
		InputStream in = ReadDB.class.getClassLoader().getResourceAsStream("db.properties");
		Properties pro = new Properties();
		pro.load(in);
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("用户名为：" + username);
		System.out.println("密码为：" + password);
	}
}
