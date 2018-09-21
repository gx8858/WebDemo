package cn.itcast.context;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ��ͨ��һ���࣬û��ServletContext����
 */
public class ReadDB {

	public void read1() throws IOException {
		// ��ȡ��ļ�������ͨ��class����
		// ֻ��д���·��
		// ֻ�ܶ�ȡsrcĿ¼�µ�����
		// getClassLoader()�൱�ڵ�classes��һ��Ŀ¼
		InputStream in = ReadDB.class.getClassLoader().getResourceAsStream("db.properties");
		Properties pro = new Properties();
		pro.load(in);
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("�û���Ϊ��" + username);
		System.out.println("����Ϊ��" + password);
	}
}
