package com.backend.listner;

import java.util.Date;

import org.springframework.context.ApplicationListener;

import com.backend.bean.Entity;
import com.backend.event.BackEndDaoEvent;

public class BackEndDaoListner implements
		ApplicationListener<BackEndDaoEvent<Entity>>{

	@Override
	public void onApplicationEvent(BackEndDaoEvent<Entity> event) {
		Entity t = event.getT();
		String publishLog = t.getPublishLog();
		System.out.println(t +" "+publishLog+" on "+new Date());
		
	}
	
}