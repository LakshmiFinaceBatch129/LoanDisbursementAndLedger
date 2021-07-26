package com.webcorestone.loandisbursement.mastermodel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.webcorestone.loandisbursement.model.LoanFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreditManager extends User 
{
	private String name;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cm")
	  
//     @OneToMany
//     Set<LoanFile> loanfile=new HashSet<>();
	private OperationalExecutive oe;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OperationalExecutive getOe() {
		return oe;
	}
	public void setOe(OperationalExecutive oe) {
		this.oe = oe;
	}
	
	

}
