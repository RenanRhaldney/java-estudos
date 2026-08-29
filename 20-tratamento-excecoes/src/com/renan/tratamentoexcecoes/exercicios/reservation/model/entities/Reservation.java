package com.renan.tratamentoexcecoes.exercicios.reservation.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.renan.tratamentoexcecoes.exercicios.reservation.model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private static DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
		if (checkout.isBefore(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
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

	public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
		
		LocalDate dateNow = LocalDate.now();
		if (checkin.isBefore(dateNow) || checkout.isBefore(dateNow)) {
			throw new DomainException("Reservation dates for update must be future dates");
		} 
		if (checkout.isBefore(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkin;
		this.checkOut = checkout;

	}

	@Override
	public String toString() {
		return String.format("Room %d, check-in: %s, check-out: %s, %d nights", roomNumber, formatoBrasileiro.format(checkIn),
				formatoBrasileiro.format(checkOut), duration());
	}

}
