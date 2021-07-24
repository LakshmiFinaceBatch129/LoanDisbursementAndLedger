package com.webcorestone.loandisbursement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class LoanFile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanFileId;
	private double customerLoanAmount;
	private int loanTenure;
	private String loansactiondate;
	private String loanStatus;
	private String disburseStatus;
	

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customers;

	
	public String getDisburseStatus() {
		return disburseStatus;
	}

	public void setDisburseStatus(String disburseStatus) {
		this.disburseStatus = disburseStatus;
	}

	public int getLoanFileId() {
		return loanFileId;
	}

	public void setLoanFileId(int loanFileId) {
		this.loanFileId = loanFileId;
	}

	public double getCustomerLoanAmount() {
		return customerLoanAmount;
	}

	public void setCustomerLoanAmount(double customerLoanAmount) {
		this.customerLoanAmount = customerLoanAmount;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public String getLoansactiondate() {
		return loansactiondate;
	}

	public void setLoansactiondate(String loansactiondate) {
		this.loansactiondate = loansactiondate;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	

	public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
	

}
