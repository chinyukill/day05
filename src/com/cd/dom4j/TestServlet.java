package com.cd.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestServlet {
//@Test
//public void testMyServlet() {
//	MyservletImpl myservletImpl = new MyservletImpl();
//	myservletImpl.init();
//	myservletImpl.service();
//	myservletImpl.destroy();
//}

//@Test
//public void TestMyServlet1() {
//	/*
//	 * 1.拿到字节码文件
//	 * 2.封装成对象
//	 * 3.通过newInstance完成对象创建
//	 */
//	String className="com.cd.dom4j.MyservletImpl";
//	try {
//		Class clazz = Class.forName(className);
//		Myservlet myservlet = (Myservlet)clazz.newInstance();
//		myservlet.init();
//		myservlet.service();
//		myservlet.destroy();
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (InstantiationException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IllegalAccessException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
	@Test
	public void testMyServletImpl() {
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read("src/web2.xml");
			Element rootElement = document.getRootElement();
			Element servletElement = rootElement.element("servlet");
			String servletClass = servletElement.element("servlet-class").getText();
			Class clazz = Class.forName(servletClass);
			MyServletImpl1 myServletImpl = (MyServletImpl1)clazz.newInstance();
			myServletImpl.init();
			myServletImpl.service();
			myServletImpl.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
