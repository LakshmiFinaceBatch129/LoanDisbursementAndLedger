package com.webcorestone.loandisbursement.mastermodel;




import javax.persistence.CascadeType;
import javax.persistence.Entity;

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
public class AccountHead extends User
{
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
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
