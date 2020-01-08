package kr.or.shopprepa.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("kr.or.shopprepa.controller")
public class WebMvcConfiguration implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/")
		.setCacheControl(CacheControl.maxAge(2,TimeUnit.MINUTES));
		registry.addResourceHandler("/js/**").addResourceLocations("/js/")
		.setCacheControl(CacheControl.maxAge(2,TimeUnit.MINUTES));
		registry.addResourceHandler("/css/**").addResourceLocations("/css/")
		.setCacheControl(CacheControl.maxAge(2,TimeUnit.MINUTES));
	}
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/",".jsp");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addViewControllers(registry);
		System.out.println("addViewControllers가 호출됩니다.");
		registry.addViewController("/").setViewName("mainpage");
	}
}
