package works.weave.socks.orders.middleware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JaegerFilter implements Filter {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String requestId = req.getHeader("x-request-id");
        //res.setHeader("My-Custom-Header", "Header-Value-Here");
        String yRequest = "no-value";
        if(requestId != null){
            yRequest = requestId;
        }
        res.setHeader("y-request-id", yRequest);
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        }catch(RuntimeException e){
            LOG.error("Error processing request: " + e.getMessage());
            ((HttpServletResponse) servletResponse).addHeader("y-request-id", yRequest);
        }
    }

    @Override
    public void destroy() {

    }
}
