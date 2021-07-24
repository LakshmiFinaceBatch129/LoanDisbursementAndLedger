package com.webcorestone.loandisbursement.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.webcorestone.loandisbursement.mastermodel.AccountHead;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DisbursementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String date;
	private String emidate;
	private String emiAmount;

	@OneToOne
	private LoanFile loanFile;

	public String getEmidate() {
		return emidate;
	}

	public void setEmidate(String emidate) {
		this.emidate = emidate;
	}

	public String getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(String emiAmount) {
		this.emiAmount = emiAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public LoanFile getLoanFile() {
		return loanFile;
	}

	public void setLoanFile(LoanFile loanFile) {
		this.loanFile = loanFile;
	}

//@OneToOne(cascade = CascadeType.ALL)
//private AccountHead ac;

}
