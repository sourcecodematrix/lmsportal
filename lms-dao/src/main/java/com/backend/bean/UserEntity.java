package com.backend.bean;

/**
 * @author Vinay
 *
 */
public abstract class UserEntity extends Entity {
	/**
	 * @return userName
	 */
	public abstract String getUserName();
	/**
	 * @return password
	 */
	public abstract String getPassword();
	public abstract String getEmailID();

}
