package com.webcorestone.loandisbursement.mastermodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Previousloandetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int previousloanId;
	private int previousLoanamount;
	private String previousLoanStatus;
	private int paidAmount;
	private int reaminingAmount;
	@OneToOne
	private Bank bank;
	public int getPreviousloanId() {
		return previousloanId;
	}
	public void setPreviousloanId(int previousloanId) {
		this.previousloanId = previousloanId;
	}
	public int getPreviousLoanamount() {
		return previousLoanamount;
	}
	public void setPreviousLoanamount(int previousLoanamount) {
		this.previousLoanamount = previousLoanamount;
	}
	public String getPreviousLoanStatus() {
		return previousLoanStatus;
	}
	public void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}
	public int getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	public int getReaminingAmount() {
		return reaminingAmount;
	}
	public void setReaminingAmount(int reaminingAmount) {
		this.reaminingAmount = reaminingAmount;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	


	

}
