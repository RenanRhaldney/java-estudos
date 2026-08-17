package com.renan.composicao.order.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.renan.composicao.order.entities.enums.OrderStatus;

public class Order {

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double total() {
		double total = 0;
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n" + "ORDER SUMMARY:");
		sb.append("\n" + "Order moment: ");
		sb.append(moment.format(dateTimeFormatter));
		sb.append("\n" + "Order status: ");
		sb.append(status);
		sb.append("\n" + "Client: ");
		sb.append(client.toString());
		sb.append("\n" + "Order items:");
		for (OrderItem item : items) {
			sb.append("\n" + item.toString());
		}
		sb.append("\n" + "Total price: $");
		sb.append(String.format("%.2f", total()));
		
		
		return sb.toString();
	}

}
