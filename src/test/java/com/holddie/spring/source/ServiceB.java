package com.holddie.spring.source;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/12 7:57
 */
public class ServiceB {

	@Autowired
	private ServiceA serviceA;

	public void sayHello(){
		serviceA.sayHello();
	}

	public ServiceA getServiceA() {
		return serviceA;
	}

	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}
}
