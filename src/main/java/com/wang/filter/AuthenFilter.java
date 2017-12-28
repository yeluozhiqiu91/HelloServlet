package com.wang.filter;


import javax.servlet.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wang on 2017/12/28.
 * 身份验证过滤器
 */
public class AuthenFilter implements Filter {
    private static SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化身份验证过滤器");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(sf.format(new Date())+" 进行身份过滤。。。");

        // 把请求传回过滤链
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
