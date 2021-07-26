package com.webcorestone.loandisbursement.mastermodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ElectronicsItems
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemid;
	private String  itemComany;
	private String itemName;
	private long price;
	
}
