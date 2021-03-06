package com.infy.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "OrderGenerator",strategy = "native")
public class Orders {
	@Id
	@GeneratedValue(generator = "OrderGenerator")
	private int id;
	private int userId;
	private double total;
	private String orderStatus;
	private int shippingAddress;
	private double deliveryCharge;
	
	
	public int getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(int shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public double getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	private LocalDate expectedDeliveryDate;
	private LocalDate orderedDate;
	private LocalDate deliveryDate;
	private LocalDate returnDate;
	private LocalDate cancelledDate;
	private boolean btnReviewProduct;
	private boolean btnReviewSeller;
	private boolean btnCancel;
	private boolean btnReturn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDate getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(LocalDate orderedDate) {
		this.orderedDate = orderedDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public LocalDate getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(LocalDate cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	public boolean isBtnReviewProduct() {
		return btnReviewProduct;
	}
	public void setBtnReviewProduct(boolean btnReviewProduct) {
		this.btnReviewProduct = btnReviewProduct;
	}
	
	public boolean isBtnReviewSeller() {
		return btnReviewSeller;
	}
	public void setBtnReviewSeller(boolean btnReviewSeller) {
		this.btnReviewSeller = btnReviewSeller;
	}
	public boolean isBtnCancel() {
		return btnCancel;
	}
	public void setBtnCancel(boolean btnCancel) {
		this.btnCancel = btnCancel;
	}
	public boolean isBtnReturn() {
		return btnReturn;
	}
	public void setBtnReturn(boolean btnReturn) {
		this.btnReturn = btnReturn;
	}
	
	
	
}
