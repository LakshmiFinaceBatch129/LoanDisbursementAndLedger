package com.webcorestone.loandisbursement.mastermodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
	public class LoanFilee {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int loanFileId;

		private double sanctionLoanAmount;

		private double customerLoanAmount;

		private int loanTenure;

		private String date;

		

		@OneToOne
		private Customerr customers;


		public int getLoanFileId() {
			return loanFileId;
		}


		public void setLoanFileId(int loanFileId) {
			this.loanFileId = loanFileId;
		}


		public double getSanctionLoanAmount() {
			return sanctionLoanAmount;
		}


		public void setSanctionLoanAmount(double sanctionLoanAmount) {
			this.sanctionLoanAmount = sanctionLoanAmount;
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


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}

		public Customerr getCustomers() {
			return customers;
		}


		public void setCustomers(Customerr customers) {
			this.customers = customers;
		}
		
		
		
		
		
}
