package cn.itcast.servlet;
 
import java.io.IOException;
 

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
/**
 * 实现servlet接口
 * @author Administrator
 * 生命周期相关方法
 */
public class ServletDemo2 implements Servlet{
     
    /**
     *  Servlet程序创建后，立即调用该方法进行初始化
     *  Servlet什么时候被创建呢？第一次访问的时候，创建Servlet实例，由服务器创建的
     *  init方法调用几次呢？该方法被调用一次
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
//    	ServletContext context = config.getServletContext();
    	System.out.println("init2...");
    }
     
    /**
     * 从客户端发送过来的请求，该方法进行处理
     * service方法调用几次？有一次请求调用一次该方法
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service2...");
    }
 
    /**
     * Servlet在从服务器移除之前，调用该方法进行销毁的操作
     * Servlet什么时候被移除？服务器关闭的时候Servlet移除
     * destroy方法被调用几次？（例：销毁数据库的链接）一次
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