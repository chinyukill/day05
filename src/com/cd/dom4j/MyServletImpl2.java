package com.cd.dom4j;

public class MyServletImpl2 implements Myservlet {

	@Override
	public void init() {
		// TODO Auto-generated method stub

		System.out.println("init2");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
System.out.println("service2");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
System.out.println("destroy2");
	}

}
