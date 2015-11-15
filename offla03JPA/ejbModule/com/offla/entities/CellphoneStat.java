package com.offla.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.persistence.Id;


@Entity
@Table(name="cellphone_stats")
public class CellphoneStat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cellphone;
	
	@Column(name="b2p_transfer")
	private BigDecimal b2pTransfer;

	@Column(name="cash_load")
	private BigDecimal cashLoad;

	private BigDecimal credit;

	private BigDecimal deposit;

	private BigDecimal payment;

	private BigDecimal request;

	private BigDecimal transfer;

	private BigDecimal withdrawal;

	public CellphoneStat() {
	}

	public BigDecimal getB2pTransfer() {
		return this.b2pTransfer;
	}

	public void setB2pTransfer(BigDecimal b2pTransfer) {
		this.b2pTransfer = b2pTransfer;
	}

	public BigDecimal getCashLoad() {
		return this.cashLoad;
	}

	public void setCashLoad(BigDecimal cashLoad) {
		this.cashLoad = cashLoad;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public BigDecimal getCredit() {
		return this.credit;
	}

	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}

	public BigDecimal getDeposit() {
		return this.deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public BigDecimal getPayment() {
		return this.payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public BigDecimal getRequest() {
		return this.request;
	}

	public void setRequest(BigDecimal request) {
		this.request = request;
	}

	public BigDecimal getTransfer() {
		return this.transfer;
	}

	public void setTransfer(BigDecimal transfer) {
		this.transfer = transfer;
	}

	public BigDecimal getWithdrawal() {
		return this.withdrawal;
	}

	public void setWithdrawal(BigDecimal withdrawal) {
		this.withdrawal = withdrawal;
	}

}