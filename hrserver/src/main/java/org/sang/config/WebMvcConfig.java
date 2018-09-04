package org.sang.config;

import org.sang.common.DateConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sang on 2018/1/2.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /*
     * @功能描述 配置日期转换器
     *
     * @author Huang
     * @date 2018/9/4 21:04
     * @param
     * @return
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new DateConverter());
    }

    @Bean
    public ExecutorService executorService() {
        return Executors.newCachedThreadPool();
    }
}
