package com.abasdemo.abasdemo;

class OrderItem {
	private int orderId;
	private int itemId;
	private int quantity;
	private double unitPrice;

	public OrderItem(int orderId, int itemId, int quantity, double unitPrice) {
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getItemId() {
		return itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
}
