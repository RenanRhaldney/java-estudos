package com.renan.enumeration.conteudo.application;

import java.util.Date;

import com.renan.enumeration.conteudo.entities.Order;
import com.renan.enumeration.conteudo.entities.enums.OrderStatus;

public class OrderProgram {

	public static void main(String[] args) {
		
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		//Converte string para enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println("OS1 = " + os1);
		System.out.println("OS2 = " + os2);

	}

}
