package com.movie.booking.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.UUID)
	private UUID bookingId;
	private String userId;
	private Integer movieId;
	@ElementCollection
	private List<String> seatsBooked;
	private LocalDate showDate;
	private LocalTime showTime;
	@Enumerated
	private BookingStatus bookingStatus;
	private  Integer bookingAmount;
	
	
	
		

}
