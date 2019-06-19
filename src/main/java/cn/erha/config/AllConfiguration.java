package cn.erha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.erha.interceptors.OrderInterceptor;

/*
 * 实现springmvc中拦截器的配置
 * 需要继承webmvc的configureAdaptor的配置适配类
 * 
 * */


@Configuration
@ImportResource(value="spring-quartz.xml")
public class AllConfiguration extends WebMvcConfigurerAdapter {
     //准备框架中需要维护的拦截器对象
	@Bean
	public OrderInterceptor orderIntInit(){
		
		return new OrderInterceptor();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		//自定义拦截器的加载，registry可以将生成拦截器对象注册
		//匹配一个拦截路径
		registry.addInterceptor(orderIntInit()).addPathPatterns("/order/**");
	}
}
