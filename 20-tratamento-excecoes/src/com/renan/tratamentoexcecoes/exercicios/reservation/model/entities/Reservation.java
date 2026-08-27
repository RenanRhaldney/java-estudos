package com.renan.tratamentoexcecoes.exercicios.reservation.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private static DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkIn;
	}

	public LocalDate getCheckout() {
		return checkOut;
	}

	public long duration() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}

	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	@Override
	public String toString() {
		return String.format("Room %d, check-in: %s, check-out: %s, %d nights", roomNumber, formatoBrasileiro.format(checkIn),
				formatoBrasileiro.format(checkOut), duration());
	}

}
