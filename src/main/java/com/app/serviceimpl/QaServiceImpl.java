package com.app.serviceimpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.IServiceApp;
@Component
@Profile("QA")
public class QaServiceImpl implements IServiceApp{

	@Override
	public void sevice() {
		// TODO Auto-generated method stub
		System.out.println("from QA runner");
		
	}

}
