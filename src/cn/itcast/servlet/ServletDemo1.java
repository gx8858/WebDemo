package cn.itcast.servlet;
 
import java.io.IOException;
 
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
/**
 * 实现servlet接口
 * @author Administrator
 *
 */
public class ServletDemo1 implements Servlet{
     
    /**
     *  接收从客户端发送过来的请求，做出响应
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 通过ServletResponse对象接收从客户端发送过来的请求
        String username = req.getParameter("username");
        System.out.println(username);
        // 使用ServletResponse对象像客户端做出响应
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