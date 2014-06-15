package com.chaos.edu.spring.appcontxt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	

	private Bean autowiredBean;
	
	public Bean getAutowiredBean() {
		return autowiredBean;
	}
	
	@Autowired
	public void setAutowiredBean(Bean autowiredBean) {
		this.autowiredBean = autowiredBean;
	}

	public static void main(String[] args) {
		
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		
		Bean emptyBean = context.getBean("emptyBean", Bean.class);
		
		System.out.println("emptyBean's name is " + emptyBean.getName());
		
		System.out.println("Default singleton: " + (context.getBean("emptyBean", Bean.class) == context.getBean("emptyBean", Bean.class)));
		
		Bean aBean = context.getBean("aBean", Bean.class);
		System.out.println("aBean's name is " + aBean.getName());
		
		Bean bBean = context.getBean("bBean", Bean.class);
		System.out.println("bBean's name is " + bBean.getName() + " next bean's name is " + bBean.getNextBean().getName());
		
		Bean cBean = context.getBean("cBean", Bean.class);
		System.out.println("cBean's name is " + cBean.getName());
		
		Bean singletonBean = context.getBean("singletonBean", Bean.class);
		System.out.println("singleton bean's name is " + singletonBean.getName());
		
		Bean dBean = context.getBean("dBean", Bean.class);
		System.out.println("dBean's name is " + dBean.getName());
		
		Bean lazyBean = context.getBean("lazyBean", Bean.class);
		System.out.println("dBean's name is " + lazyBean.getName());
		
		App a = new App();
		System.out.println("autowiredBean's name is " + a.autowiredBean.getName());
	}
}