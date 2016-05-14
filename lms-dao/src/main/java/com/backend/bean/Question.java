package com.backend.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Vinay
 * 
 */
public class Question extends TestEntity implements Serializable {
	private static final long serialVersionUID = -6034665023447471690L;
	private String question;

	transient private Paper paper;
	private Date createDate;
	private String oa;
	private String ob;
	private String oc;
	private String od;
	private long paperID;
	private String answere;

	public Question() {

	}

	/**
	 * @param id
	 * @param question
	 * @param paper
	 * @param oa
	 * @param ob
	 * @param oc
	 * @param od
	 * @param answere
	 */
	public Question(long id, String question, Paper paper, String oa,
			String ob, String oc, String od, String answere) {
		super(id);
		this.question = question;
		this.paper = paper;
		this.oa = oa;
		this.ob = ob;
		this.oc = oc;
		this.od = od;
		this.answere = answere;
	}

	/**
	 * @param question
	 * @param paper
	 * @param createDate
	 * @param oa
	 * @param ob
	 * @param oc
	 * @param od
	 * @param answere
	 */
	public Question(String question, Paper paper, Date createDate, String oa,
			String ob, String oc, String od, String answere) {

		this.question = question;
		this.paper = paper;
		this.createDate = createDate;
		this.oa = oa;
		this.ob = ob;
		this.oc = oc;
		this.od = od;
		this.answere = answere;
	}

	/**
	 * @param id
	 * @param question
	 * @param paper
	 * @param createDate
	 * @param oa
	 * @param ob
	 * @param oc
	 * @param od
	 * @param answere
	 */
	public Question(long id, String question, Paper paper, Date createDate,
			String oa, String ob, String oc, String od, String answere) {
		super(id);
		this.question = question;
		this.paper = paper;
		this.createDate = createDate;
		this.oa = oa;
		this.ob = ob;
		this.oc = oc;
		this.od = od;
		this.answere = answere;
	}

	/**
	 * @return question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 */

	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return oa
	 */
	public String getOa() {
		return oa;
	}

	/**
	 * @param oa
	 */
	public void setOa(String oa) {
		this.oa = oa;
	}

	/**
	 * @return ob
	 */
	public String getOb() {
		return ob;
	}

	/**
	 * @param ob
	 */
	public void setOb(String ob) {
		this.ob = ob;
	}

	/**
	 * @return oc
	 */
	public String getOc() {
		return oc;
	}

	/**
	 * @param oc
	 */
	public void setOc(String oc) {
		this.oc = oc;
	}

	/**
	 * @return od
	 */
	public String getOd() {
		return od;
	}

	/**
	 * @param od
	 */
	public void setOd(String od) {
		this.od = od;
	}

	/**
	 * @return answer
	 */
	public String getAnswere() {
		return answere;
	}

	/**
	 * @param answere
	 */
	public void setAnswere(String answere) {
		this.answere = answere;
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
	 * @return paper
	 */
	public Paper getPaper() {
		return paper;
	}

	/**
	 * @param paper
	 */
	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	

	public long getPaperID() {
		return paperID;
	}

	public void setPaperID(long paperID) {
		this.paperID = paperID;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"qid:"+getId();
	}

}
