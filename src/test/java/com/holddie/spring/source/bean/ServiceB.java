package com.holddie.spring.source.bean;

import com.holddie.spring.source.configbean.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/12 7:57
 */
@Component
public class ServiceB {

	@Autowired
	private ServiceA serviceA;

	public void sayHello(){
		serviceA.sayHello();
	}

	public ServiceA getServiceA() {
		return serviceA;
	}

	@Required
	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}
}
