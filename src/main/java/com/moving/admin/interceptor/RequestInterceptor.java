package com.moving.admin.interceptor;


import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.moving.admin.annotation.IgnoreSecurity;
import com.moving.admin.bean.TokenInformation;
import com.moving.admin.exception.WebException;
import com.moving.admin.util.JwtUtil;

@Service
@Component
public class RequestInterceptor implements HandlerInterceptor {
    @Resource
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = null;
//        if (handler instanceof HandlerMethod) {
//            handlerMethod = (HandlerMethod) handler;
//        } else {
//            return true;
//        }
//        IgnoreSecurity ignoreSecurity = handlerMethod.getMethodAnnotation(IgnoreSecurity.class);
//        //若请求资源不是api，则通过，也可以根据 origin 来访地址决定是否放行指定的项目资源
//        //无需登录
//        if (ignoreSecurity != null) {
//            return true;
//        } else {
//            String jwt = request.getHeader("token");
//            if (jwt != null && jwt != "") {
//                Map<String, Object> map = jwtUtil.decode(jwt, TokenInformation.class);
//                if (map == null) {
//                    throw new WebException(401, "未登录", null);
//                }
////					TokenInformation tokenInformation = (TokenInformation) map.get("token");
//                if ((boolean) map.get("overtime")) {
//                    throw new WebException(403, "登录超时", null);
//                }
//                return true;
//            }
//        }
//        // 未登录
//        throw new WebException(401, "未登录", null);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
