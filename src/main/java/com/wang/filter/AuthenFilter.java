package com.wang.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wang on 2017/12/28.
 * 身份验证过滤器
 */
public class AuthenFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化身份验证过滤器");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进行身份过滤。。。");

        // 把请求传回过滤链
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
