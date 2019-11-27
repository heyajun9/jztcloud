package com.jzt.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpRequest;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Admin
 * @create 2019-11-27 15:08
 * @desc
 **/
@Component
public class LogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER+1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext cxt=RequestContext.getCurrentContext();
        HttpServletRequest request=cxt.getRequest();
        System.out.println(request.getRemoteAddr()+"访问了："+request.getRequestURI()+"路由后的地址："+cxt.get(FilterConstants.REQUEST_URI_KEY).toString());
        return null;
    }
}
