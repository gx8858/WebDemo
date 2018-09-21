package cn.itcast.servlet;
 
import java.io.IOException;
 

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
/**
 * ʵ��servlet�ӿ�
 * @author Administrator
 * ����������ط���
 */
public class ServletDemo2 implements Servlet{
     
    /**
     *  Servlet���򴴽����������ø÷������г�ʼ��
     *  Servletʲôʱ�򱻴����أ���һ�η��ʵ�ʱ�򣬴���Servletʵ�����ɷ�����������
     *  init�������ü����أ��÷���������һ��
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
//    	ServletContext context = config.getServletContext();
    	System.out.println("init2...");
    }
     
    /**
     * �ӿͻ��˷��͹��������󣬸÷������д���
     * service�������ü��Σ���һ���������һ�θ÷���
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service2...");
    }
 
    /**
     * Servlet�ڴӷ������Ƴ�֮ǰ�����ø÷����������ٵĲ���
     * Servletʲôʱ���Ƴ����������رյ�ʱ��Servlet�Ƴ�
     * destroy���������ü��Σ��������������ݿ�����ӣ�һ��
     */
    @Override
    public void destroy() {
         System.out.println("destroy...");
    }
 
    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }
 
     
}