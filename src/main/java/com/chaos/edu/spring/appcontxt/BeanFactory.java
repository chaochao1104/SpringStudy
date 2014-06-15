package com.chaos.edu.spring.appcontxt;

public class BeanFactory {
	
	private Bean singletonBean = new Bean("Singleton Bean held by BeanFactory");
	
	public Bean singleton() {
		return singletonBean;
	}
}
