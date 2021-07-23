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
public class OperationalExecutive extends User 
{
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private RelationalExecutive re;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CreditManager cm;

}
