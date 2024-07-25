package com.abasdemo.abasdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbasdemoApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(AbasdemoApplication.class, args);
	}*/
	public static void main(String[] args) {
		Order order = new Order();
		
		/*
		order.addItem(new OrderItem(1000, 2000, 12, 100.51));
		order.addItem(new OrderItem(1000, 2001, 31, 200));
		order.addItem(new OrderItem(1000, 2002, 22, 150.86));
		order.addItem(new OrderItem(1000, 2003, 41, 250));
		order.addItem(new OrderItem(1000, 2004, 55, 244));

		System.out.println("Total Amount: " + order.calculateTotalAmount());
		System.out.println("Average Price: " + order.calculateAveragePrice());
		System.out.println("Average Price Per Item: " + order.calculateAveragePricePerItem());
		System.out.println("Item Count Per Order: " + order.countItemsPerOrder());*/

		order.addItem(new OrderItem(1000, 2000, 12, 100.51));
        order.addItem(new OrderItem(1000, 2001, 31, 200));
        order.addItem(new OrderItem(1000, 2002, 22, 150.86));
        order.addItem(new OrderItem(1000, 2003, 41, 250));
        order.addItem(new OrderItem(1000, 2004, 55, 244));
        order.addItem(new OrderItem(1001, 2001, 88, 121));
        order.addItem(new OrderItem(1001, 2002, 74, 1444.531));
        order.addItem(new OrderItem(1001, 2004, 88, 211));
        order.addItem(new OrderItem(1001, 2002, 88, 88.11));
        order.addItem(new OrderItem(1002, 2003, 2, 12.1));
        order.addItem(new OrderItem(1002, 2004, 3, 22.3));
        order.addItem(new OrderItem(1002, 2003, 8, 12.1));
        order.addItem(new OrderItem(1002, 2002, 16, 94));
        order.addItem(new OrderItem(1002, 2005, 9, 44.1));
        order.addItem(new OrderItem(1002, 2006, 19, 90));
		System.out.println("Total Amount: " + order.calculateTotalAmount());
		System.out.println("Average Price: " + order.calculateAveragePrice());
		System.out.println("Average Price Per Item: " + order.calculateAveragePricePerItem());
		System.out.println("Item Count Per Order: " + order.countItemsPerOrder());
	}

}
