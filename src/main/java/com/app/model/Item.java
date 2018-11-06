package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemtab")
public class Item {
	@Id
	@GeneratedValue
	private Integer itemId;
	private String itemCode;
	private double width;
	private double length;
	private double height;
	private double bcast;
	private String baseCurrency;
	private String itemUom;
	private String iescription;

	public Item(Integer itemId) {
		super();
		this.itemId = itemId;
	}

	public Item(Integer itemId, String itemCode, double width, double length, double height, double bcast,
			String baseCurrency, String itemUom, String iescription, UOM uom, Order saleType, Order purchaseType) {
		super();
		this.itemId = itemId;
		this.itemCode = itemCode;
		this.width = width;
		this.length = length;
		this.height = height;
		this.bcast = bcast;
		this.baseCurrency = baseCurrency;
		this.itemUom = itemUom;
		this.iescription = iescription;
		this.uom = uom;
		this.saleType = saleType;
		this.purchaseType = purchaseType;
	}

	@ManyToOne
	@JoinColumn(name = "uomfkid")
	private UOM uom;

	@ManyToOne
	@JoinColumn(name = "saleId")
	private Order saleType;

	@ManyToOne
	@JoinColumn(name = "purchaseId")
	private Order purchaseType;

	public Item() {
		super();
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBcast() {
		return bcast;
	}

	public void setBcast(double bcast) {
		this.bcast = bcast;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public String getIescription() {
		return iescription;
	}

	public void setIescription(String iescription) {
		this.iescription = iescription;
	}

	public UOM getUom() {
		return uom;
	}

	public void setUom(UOM uom) {
		this.uom = uom;
	}

	public Order getSaleType() {
		return saleType;
	}

	public void setSaleType(Order saleType) {
		this.saleType = saleType;
	}

	public Order getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(Order purchaseType) {
		this.purchaseType = purchaseType;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemCode=" + itemCode + ", width=" + width + ", length=" + length
				+ ", height=" + height + ", bcast=" + bcast + ", baseCurrency=" + baseCurrency + ", itemUom=" + itemUom
				+ ", iescription=" + iescription + ", uom=" + uom + ", saleType=" + saleType + ", purchaseType="
				+ purchaseType + "]";
	}

}