package com.example.gkelogstash.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInterceptor extends HandlerInterceptorAdapter {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    logger.info("-------- LogInterception.preHandle --- ");
    logger.info("Request URL: " + request.getRequestURL());

    // LoggingContext loggingContext = buildSIEMLoggingConextFromHttpServletRequest(request);
    // installContext(loggingContext);

    MDC.putCloseable("userId", request.getRemoteUser());
    MDC.putCloseable("sourceIPAddress", request.getRemoteAddr());
    MDC.putCloseable("destinationIPAddress", request.getLocalAddr());
    MDC.putCloseable("protocol", request.getProtocol());
    MDC.putCloseable("terminalAddress", request.getLocalAddr());

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, //
      Object handler, ModelAndView modelAndView) throws Exception {

    logger.info("-------- LogInterception.postHandle --- ");
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, //
      Object handler, Exception ex) throws Exception {
    logger.info("-------- LogInterception.afterCompletion --- ");

    MDC.clear();
  }

}
