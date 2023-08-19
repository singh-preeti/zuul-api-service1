package com.zuulapi.filter;

import com.netflix.zuul.ZuulFilter;
public class PostFilter extends ZuulFilter {
	
	@Override 
	public String filterType()
	{
		return "post";
	}
	
	@Override 
	public int filterOrder()
	{
		return 1;
	}

	@Override 
	public boolean shouldFilter()
	{
		return true;
	}
	
	@Override 
	public Object run()
	{
		System.out.println("Run the filter!");
		return null;
	}
}
