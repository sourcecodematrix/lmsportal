package com.backend.bean;

public abstract class Entity {
	private long id;
	private int version;
	public Entity(long id) {
		super();
		this.id = id;
	}
	public Entity() {
		// TODO Auto-generated constructor stub
	}

	private String publishLog;
	public String getPublishLog() {
		return publishLog;
	}

	public void setPublishLog(String publishLog) {
		this.publishLog = publishLog;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

}
