package org.admin.manage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO file
@Entity
@Table(name = "Admin_manage")
public class AdminManage {
	@Id
	@Column(name = "sweet_id")
	private int sweetId;// Represents sweet category
	@Column(name = "sweet_quantity")
	private int sweetQuantity;// in Kgs
	@Column(name = "sweet_name")
	private String sweetName;
	@Column(name = "sweet_price")
	private int sweetPrice; // price per kg
	@Column(name = "sweet_offers")
	private int offers;

	// default constructor
	public AdminManage() {
		super();
	}

	// parameterized constructor
	public AdminManage(int sweetId, int sweetQuantity, String sweetName, int sweetPrice, int offers) {
		super();
		this.sweetId = sweetId;
		this.sweetQuantity = sweetQuantity;
		this.sweetName = sweetName;
		this.sweetPrice = sweetPrice;
		this.offers = offers;
	}

	// getters and setters
	public int getSweetId() {
		return sweetId;
	}

	public void setSweetId(int sweetId) {
		this.sweetId = sweetId;
	}

	public int getSweetQuantity() {
		return sweetQuantity;
	}

	public void setSweetQuantity(int sweetQuantity) {
		this.sweetQuantity = sweetQuantity;
	}

	public String getSweetName() {
		return sweetName;
	}

	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}

	public int getSweetPrice() {
		return sweetPrice;
	}

	public void setSweetPrice(int sweetPrice) {
		this.sweetPrice = sweetPrice;
	}

	public int getOffers() {
		return offers;
	}

	public void setOffers(int offers) {
		this.offers = offers;
	}

	// return the value in the form of toString
	@Override
	public String toString() {
		return "AdminManage [sweetId=" + sweetId + " , sweetQuantity=" + sweetQuantity + " , sweetName= " + sweetName
				+ ", sweetPrice= " + sweetPrice + ", offers= " + offers + "]";
	}

}
