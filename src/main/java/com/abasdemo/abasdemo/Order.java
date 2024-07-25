package com.abasdemo.abasdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
	private List<OrderItem> items;

	public Order() {
		this.items = new ArrayList<>();
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	// a. Calculate the total amount for all items
	public double calculateTotalAmount() {
		double total = 0;
		for (OrderItem item : items) {
			total += item.getQuantity() * item.getUnitPrice();
		}
		return total;
	}

	// b. Calculate the average price of all items
	public double calculateAveragePrice() {
		double total = 0;
		int count = 0;
		for (OrderItem item : items) {
			total += item.getUnitPrice();
			count++;
		}
		return count == 0 ? 0 : total / count;
	}

	// c. Calculate the average price per item type
	public Map<Integer, Double> calculateAveragePricePerItem() {
		Map<Integer, Double> totalPriceMap = new HashMap<>();
		Map<Integer, Integer> countMap = new HashMap<>();

		for (OrderItem item : items) {
			int itemId = item.getItemId();
			totalPriceMap.put(itemId, totalPriceMap.getOrDefault(itemId, 0.0) + item.getUnitPrice());
			countMap.put(itemId, countMap.getOrDefault(itemId, 0) + 1);
		}

		Map<Integer, Double> averagePriceMap = new HashMap<>();
		for (Map.Entry<Integer, Double> entry : totalPriceMap.entrySet()) {
			int itemId = entry.getKey();
			averagePriceMap.put(itemId, entry.getValue() / countMap.get(itemId));
		}

		return averagePriceMap;
	}

	// d. Count the number of each item type across all orders
	public Map<Integer, Integer> countItemsPerOrder() {
		Map<Integer, Integer> itemCountMap = new HashMap<>();

		for (OrderItem item : items) {
			int itemId = item.getItemId();
			itemCountMap.put(itemId, itemCountMap.getOrDefault(itemId, 0) + item.getQuantity());
		}

		return itemCountMap;
	}

	
}

