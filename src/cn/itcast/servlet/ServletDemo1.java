package cn.itcast.servlet;
 
import java.io.IOException;
 
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
/**
 * ʵ��servlet�ӿ�
 * @author Administrator
 *
 */
public class ServletDemo1 implements Servlet{
     
    /**
     *  ���մӿͻ��˷��͹���������������Ӧ
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // ͨ��ServletResponse������մӿͻ��˷��͹���������
        String username = req.getParameter("username");
        System.out.println(username);
        // ʹ��ServletResponse������ͻ���������Ӧ
        res.getWriter().print("username is success");
    }
 
    @Override
    public void destroy() {
         
    }
 
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
 
    @Override
    public String getServletInfo() {
        return null;
    }
 
    @Override
    public void init(ServletConfig arg0) throws ServletException {
         
    }
 
     
 
     
}