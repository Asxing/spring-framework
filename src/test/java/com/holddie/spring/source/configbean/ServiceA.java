package com.holddie.spring.source.configbean;

import org.springframework.stereotype.Component;

/**
 * ServiceA
 * @author HoldDie
 * @email HoldDie@163.com
 * @date 2018/4/12 16:41
 */
@Component
public class ServiceA {

	private String serviceName;

	public void sayHello() {
		System.out.println("ServiceA sayHello " + serviceName);
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
