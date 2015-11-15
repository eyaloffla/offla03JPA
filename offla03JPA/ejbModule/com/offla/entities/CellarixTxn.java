package com.offla.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;



@Entity
@Table(name="\"Cellarix_txn\"")
public class CellarixTxn implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	private Integer cellphone;
	
	@Column(name="\"Amount\"")
	private BigDecimal amount;

	@Column(name="\"Balance\"")
	private BigDecimal balance;

	@Column(name="\"Deal_ID\"")
	private Integer deal_ID;

	@Column(name="e_mail")
	private String eMail;

	@Column(name="\"ID_No\"")
	private Integer ID_No;

	@Column(name="logging_date")
	private String loggingDate;

	private String name;

	@Column(name="\"TGI\"")
	private String tgi;

	@Column(name="txn_date")
	private String txnDate;

	@Column(name="txn_id")
	private Integer txnId;

	@Column(name="txn_type")
	private String txnType;

	public CellarixTxn() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Integer getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(Integer cellphone) {
		this.cellphone = cellphone;
	}

	public Integer getDeal_ID() {
		return this.deal_ID;
	}

	public void setDeal_ID(Integer deal_ID) {
		this.deal_ID = deal_ID;
	}

	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public Integer getID_No() {
		return this.ID_No;
	}

	public void setID_No(Integer ID_No) {
		this.ID_No = ID_No;
	}

	public String getLoggingDate() {
		return this.loggingDate;
	}

	public void setLoggingDate(String loggingDate) {
		this.loggingDate = loggingDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTgi() {
		return this.tgi;
	}

	public void setTgi(String tgi) {
		this.tgi = tgi;
	}

	public String getTxnDate() {
		return this.txnDate;
	}

	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}

	public Integer getTxnId() {
		return this.txnId;
	}

	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}

	public String getTxnType() {
		return this.txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

}