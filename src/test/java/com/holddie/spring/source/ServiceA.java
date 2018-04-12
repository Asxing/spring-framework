package com.holddie.spring.source;

/**
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/12 7:57
 */
public class ServiceA {

	private String serviceName;

	public void sayHello(){
		System.out.println("ServiceA sayHello " + serviceName);
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
