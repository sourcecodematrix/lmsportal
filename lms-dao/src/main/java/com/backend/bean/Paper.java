package com.backend.bean;

import java.util.Date;
import java.util.Set;

/**
 * @author Vinay
 * 
 */
public class Paper extends TestEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7381619038851660948L;

	private String paperName;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private Date createDate;
	private boolean status;
	private Category category;
	private Set<Question> questions;

	/**
	 * @param paperName
	 * @param createDate
	 * @param status
	 * @param category
	 */
	public Paper(String paperName, Date createDate, boolean status,
			Category category) {
		super();
		this.paperName = paperName;
		this.createDate = createDate;
		this.status = status;
		this.category = category;
	}

	public Paper(String paperName, Date createDate, boolean status,
			Category category, String description) {
		super();
		this.paperName = paperName;
		this.createDate = createDate;
		this.status = status;
		this.category = category;
		this.description = description;
	}

	public Paper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return paperName
	 */
	public String getPaperName() {
		return paperName;
	}

	/**
	 * @param paperName
	 */
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	/**
	 * @return createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	 * @return category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return questions
	 */
	public Set<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 */
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "qid:" + getId();
	}
}
