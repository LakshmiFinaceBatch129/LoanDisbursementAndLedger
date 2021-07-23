package com.webcorestone.loandisbursement.mastermodel;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
public class RelationalExecutive extends User 
{
	private String name;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "re")
	private OperationalExecutive oe;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Customerr> customer;

}
