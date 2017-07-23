package com.linchao.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author : linchao
 * @date : 2017/7/23.
 * @description :
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {  //
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {  //将servlet映射到/
        return new String[]{"/"};
    }
}
