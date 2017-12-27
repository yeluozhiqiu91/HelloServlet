package com.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wang on 2017/12/27.
 * 主要演示了init方法只运行一次，以及整个http请求及响应的过程
 */
public class HelloServlet extends HttpServlet{
    private String message;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out=resp.getWriter();
        out.println("<h1>"+message+"</h1>");
        System.out.println("每请求一次就会执行一次。。。");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("调用destory");
    }

    @Override
    public void init() throws ServletException {
        message="init方法初始化一次，Hello World";
        System.out.println(message);
    }
}
