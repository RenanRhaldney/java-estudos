package com.renan.tratamentoexcecoes.exercicios.reservation.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.renan.tratamentoexcecoes.exercicios.reservation.model.entities.Reservation;

public class ReservationProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.nextLine(), fmt);

		if (checkOut.isBefore(checkIn)) {
			System.out.println("Eror in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
			System.out.println("");
			System.out.println("Enter Data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkInUpdate = LocalDate.parse(sc.nextLine(), fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOutUpdate = LocalDate.parse(sc.nextLine(), fmt);

			LocalDate dateNow = LocalDate.now();
			if (checkInUpdate.isBefore(dateNow) || checkOutUpdate.isBefore(dateNow)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (checkOutUpdate.isBefore(checkInUpdate)) {
				System.out.println("Eror in reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDates(checkInUpdate, checkOutUpdate);
				System.out.println("Reservation: " + reservation.toString());
			}
		}

		sc.close();

	}

}
