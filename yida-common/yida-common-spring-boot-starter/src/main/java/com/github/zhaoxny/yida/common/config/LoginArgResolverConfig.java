//package com.github.zhaoxny.yida.common.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.web.method.support.HandlerMethodArgumentResolver;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.List;
//
///**
// * 公共配置类, 一些公共工具配置
// *
// * @Author Henry
// */
//public class LoginArgResolverConfig implements WebMvcConfigurer {
//    @Lazy
//    @Autowired
//    private UserService userService;
//    /**
//     * Token参数解析
//     *
//     * @param argumentResolvers 解析类
//     */
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(new TokenArgumentResolver(userService));
//    }
//}
