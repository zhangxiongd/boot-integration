package com.boot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;

/**
 * @author zhangxiong
 * @date 2017/8/8.
 */
@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {

    private Logger logger = org.slf4j.LoggerFactory.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("param flag = {}", request.getParameter("flag"));
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
