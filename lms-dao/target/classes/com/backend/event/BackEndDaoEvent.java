package com.backend.event;

import org.springframework.context.ApplicationEvent;

import com.backend.bean.Category;

public class BackEndDaoEvent<T> extends ApplicationEvent {

	private T t;
	public BackEndDaoEvent(T t) {
		super(t);
		this.setT(t);
		// TODO Auto-generated constructor stub
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	private static final long serialVersionUID = -7445773891442101084L;

}
