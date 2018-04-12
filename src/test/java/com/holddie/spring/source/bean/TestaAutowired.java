package com.holddie.spring.source.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实体类注解扫描
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/12 8:03
 */
public class TestaAutowired {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext("bean-test.xml");
		cpxa.getBean("serviceB",ServiceB.class).sayHello();
	}
}
