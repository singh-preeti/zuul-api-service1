package com.zuulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuulapi.filter.ErrorFilter;
import com.zuulapi.filter.PostFilter;
import com.zuulapi.filter.PreFilter;
import com.zuulapi.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiApplication.class, args);
	}
	@Bean
	public PreFilter preFilter()
	{
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter()
	{
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter()
	{
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter()
	{
		return new RouteFilter();
	}

}
