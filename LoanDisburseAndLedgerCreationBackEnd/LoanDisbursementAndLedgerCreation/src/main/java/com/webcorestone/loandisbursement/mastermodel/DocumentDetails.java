package com.webcorestone.loandisbursement.mastermodel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDetails 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documentid;
	private int customerid;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] addharcard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] postdatedcheck;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] bankstatement;
	@Lob
	private byte[] itrfile;
	@Lob
	private byte[] salaryslip;
	@Lob
	private byte[] previousloanstatement;
	
}
