package com.backend.bean;

import java.util.Date;
import java.util.Set;

/**
 * @author Vinay
 * 
 */
public class Category extends TestEntity {
	private String msg;
	private String paperCategory;
	private Date creationDate;
	private boolean status;
	transient private Set<Paper> papers;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param paperName
	 * @param creationDate
	 * @param status
	 */
	public Category(String paperName, Date creationDate, boolean status,
			String description) {
		super();
		this.setPaperCategory(paperName);
		this.creationDate = creationDate;
		this.status = status;
		this.description = description;
	}

	/**
	 * @param categoryID
	 * @param paperCategory
	 * @param creationDate
	 * @param status
	 */
	public Category(long id, String paperCategory, Date creationDate,
			boolean status) {
		super(id);

		this.setPaperCategory(paperCategory);
		this.creationDate = creationDate;
		this.status = status;
	}

	/**
	 * 
	 */
	public Category() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return paperCategory
	 */
	public String getPaperCategory() {
		return paperCategory;
	}

	/**
	 * @param paperCategory
	 */
	public void setPaperCategory(String paperCategory) {
		this.paperCategory = paperCategory;
	}

	/**
	 * @return papers
	 */
	public Set<Paper> getPapers() {
		return papers;
	}

	/**
	 * @param papers
	 */
	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}

	@Override
	public String toString() {

		return "qid:" + getId();

	}

}
