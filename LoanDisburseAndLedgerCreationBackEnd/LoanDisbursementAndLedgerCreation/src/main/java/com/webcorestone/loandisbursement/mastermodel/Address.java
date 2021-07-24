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
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String loaclHouseNo;
	private String localArea;
	private String localLandmark;
	private String localCity;
	private String localState;
	private String permanantHouseNo;
	private String permanantArea;
	private String permanantLandmark;
	private String permanatCity;
	private String permanatState;
	private String country;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLoaclHouseNo() {
		return loaclHouseNo;
	}
	public void setLoaclHouseNo(String loaclHouseNo) {
		this.loaclHouseNo = loaclHouseNo;
	}
	public String getLocalArea() {
		return localArea;
	}
	public void setLocalArea(String localArea) {
		this.localArea = localArea;
	}
	public String getLocalLandmark() {
		return localLandmark;
	}
	public void setLocalLandmark(String localLandmark) {
		this.localLandmark = localLandmark;
	}
	public String getLocalCity() {
		return localCity;
	}
	public void setLocalCity(String localCity) {
		this.localCity = localCity;
	}
	public String getLocalState() {
		return localState;
	}
	public void setLocalState(String localState) {
		this.localState = localState;
	}
	public String getPermanantHouseNo() {
		return permanantHouseNo;
	}
	public void setPermanantHouseNo(String permanantHouseNo) {
		this.permanantHouseNo = permanantHouseNo;
	}
	public String getPermanantArea() {
		return permanantArea;
	}
	public void setPermanantArea(String permanantArea) {
		this.permanantArea = permanantArea;
	}
	public String getPermanantLandmark() {
		return permanantLandmark;
	}
	public void setPermanantLandmark(String permanantLandmark) {
		this.permanantLandmark = permanantLandmark;
	}
	public String getPermanatCity() {
		return permanatCity;
	}
	public void setPermanatCity(String permanatCity) {
		this.permanatCity = permanatCity;
	}
	public String getPermanatState() {
		return permanatState;
	}
	public void setPermanatState(String permanatState) {
		this.permanatState = permanatState;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	


}
