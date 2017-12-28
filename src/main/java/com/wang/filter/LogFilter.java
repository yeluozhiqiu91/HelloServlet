package com.wang.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wang on 2017/12/28.
 * 不要implement错了哦，是javax里面的Filter
 * 日志过滤器
 */
public class LogFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        String site=filterConfig.getInitParameter("Site");
        // 输出初始化参数
        System.out.println("网站名称: " + site);
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 输出站点名称
        System.out.println("站点网址：http://www.leowang.com");

        // 把请求传回过滤链
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
