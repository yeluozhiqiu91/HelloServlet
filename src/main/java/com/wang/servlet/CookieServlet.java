package com.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Created by wang on 2017/12/27.
 * 演示表单数据
 * 在浏览器输入：http://localhost:8080/get.jsp
 * 使用get提交之后浏览器地址自动会把参数加到后面，像这样
 * http://localhost:8080/HelloForm?name=wang&url=www.wke.com
 * 而用post提交后不会，像这样：http://localhost:8080/HelloForm
 * 填写表单后提交
 */
public class CookieServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 为名字和姓氏创建 Cookie
        Cookie name=new Cookie("name", URLEncoder.encode(req.getParameter("name"),"UTF-8"));
        Cookie url=new Cookie("url",req.getParameter("url"));
        // 为两个 Cookie 设置过期日期为 24 小时后
        name.setMaxAge(60*60*24);
        url.setMaxAge(60*60*24);
        // 在响应头中添加两个 Cookie
        resp.addCookie(name);
        resp.addCookie(url);
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        String title="设置 Cookie 实例";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名：</b>："
                + req.getParameter("name") + "\n</li>" +
                "  <li><b>站点 URL：</b>："
                + req.getParameter("url") + "\n</li>" +
                "</ul>\n" +
                "</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
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
