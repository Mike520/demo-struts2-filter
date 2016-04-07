package com.cool.struts2.helloworld;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by liwenxiang on 2016/3/2.
 */
public class FilterDispatcher implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;

        String servletPath = request.getServletPath();
        String path = null;
        if(servletPath.equals("/product-input.action")) {
             path =   "/WEB-INF/input.jsp";
        }
        if(servletPath.equals("/product-save.action")) {
            String requestName = request.getParameter("productName");
            String requestDesc = request.getParameter("productDesc");
            double requestPrice = Double.parseDouble(request.getParameter("productPrice"));
//            String s1 = "1234567890123456.1234";
//            double v = Double.parseDouble(s1);
            requestPrice = 1234567890123.1234;

            Product product = new Product("1001", requestName, requestDesc, requestPrice);

            System.out.println("Save product: "+product.toString());
            request.setAttribute("product", product);

            path =   "/WEB-INF/details.jsp";
        }
        if(path != null) {
            req.getRequestDispatcher(path).forward(req,resp);
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
