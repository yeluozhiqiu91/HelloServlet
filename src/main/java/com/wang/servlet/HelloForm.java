package com.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wang on 2017/12/27.
 * 演示表单数据
 * 在浏览器输入：http://localhost:8080/get.jsp
 * 使用get提交之后浏览器地址自动会把参数加到后面，像这样
 * http://localhost:8080/HelloForm?name=wang&url=www.wke.com
 * 而用post提交后不会，像这样：http://localhost:8080/HelloForm
 * 填写表单后提交
 */
public class HelloForm extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        String title="使用Get方法读取表单数据";
        String name=new String(req.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："
                + name + "\n" +
                "  <li><b>网址</b>："
                + req.getParameter("url") + "\n" +
                "</ul>\n" +
                "</body></html>");

    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
