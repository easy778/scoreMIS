package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "CharacterEncodingFilter")
public class EncodingFilter implements Filter {

    private String encoding = "UTF-8"; // 默认编码

    public void init(FilterConfig filterConfig) throws ServletException {
        // 从配置文件中获取编码，如果没有配置则使用默认值
        String encodingParam = filterConfig.getInitParameter("encoding");
        if (encodingParam != null) {
            encoding = encodingParam;
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 设置请求和响应的字符编码
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;

            // 设置请求的字符编码
            if (httpRequest.getCharacterEncoding() == null) {
                httpRequest.setCharacterEncoding(encoding);
            }

            // 设置响应的字符编码
            httpResponse.setCharacterEncoding(encoding);
        }

        // 继续后续的过滤器链或Servlet处理
        chain.doFilter(request, response);
    }

    public void destroy() {
        // 清理资源
    }
}