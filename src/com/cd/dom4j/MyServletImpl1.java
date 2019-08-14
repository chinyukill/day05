package com.cd.dom4j;

public class MyServletImpl1 implements Myservlet {

	@Override
	public void init() {
		// TODO Auto-generated method stub

		System.out.println("init1");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
System.out.println("service1");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
System.out.println("destroy1");
	}

}
