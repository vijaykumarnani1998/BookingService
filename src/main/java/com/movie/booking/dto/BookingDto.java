package com.movie.booking.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import com.movie.booking.entity.BookingStatus;

import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingDto {


	private UUID bookingId;
	private String userId;
	private Integer movieId;
	
	private List<String> seatsBooked;
	private LocalDate showDate;
	private LocalTime showTime;
	@Enumerated
	private BookingStatus bookingStatus;
	private  Integer bookingAmount;
	
	
}
