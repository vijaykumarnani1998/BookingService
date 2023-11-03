package com.movie.booking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.booking.broker.PaymentBroker;
import com.movie.booking.dto.BookingDto;
import com.movie.booking.entity.BookingEntity;
import com.movie.booking.entity.BookingStatus;
import com.movie.booking.repo.BookingRepository;
import com.movie.booking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private PaymentBroker payment;

	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public BookingDto createBooking(BookingDto bookingDto) {

		
		  BookingEntity bookingEntity = BookingEntity.builder()
		                .bookingAmount(bookingDto.getBookingAmount())
		                .seatsBooked(bookingDto.getSeatsBooked())
		                .bookingStatus(BookingStatus.PENDING) //
		                .movieId(bookingDto.getMovieId()) .userId(bookingDto.getUserId())
		                .seatsBooked(bookingDto.getSeatsBooked()) 
		                .showDate(bookingDto.getShowDate())
		                .showTime(bookingDto.getShowTime()) 
		                .userId(bookingDto.getUserId())
		                .build();
		  
		 
			/*
			 * BookingEntity bookingEntity = new BookingEntity();
			 * bookingEntity.setBookingAmount(bookingDto.getBookingAmount());
			 * bookingEntity.setUserId(bookingDto.getUserId());
			 * bookingEntity.setBookingStatus(BookingStatus.PENDING);
			 * bookingEntity.setMovieId(bookingDto.getMovieId());
			 * bookingEntity.setShowDate(bookingDto.getShowDate());
			 * bookingEntity.setShowTime(bookingDto.getShowTime());
			 * bookingEntity.setSeatsBooked(bookingDto.getSeatsBooked());
			 */

		bookingRepository.save(bookingEntity);

		BookingDto bookingDto1 = BookingDto.builder()
				                .bookingId(bookingEntity.getBookingId())
				                .bookingAmount(bookingEntity.getBookingAmount())
				                .bookingStatus(BookingStatus.CONFIRMED)
				                .movieId(bookingEntity.getMovieId())
				                .seatsBooked(bookingEntity.getSeatsBooked())
			                  	.showTime(bookingEntity.getShowTime())
				                .showDate(bookingEntity.getShowDate())
				                .userId(bookingEntity.getUserId())
				                .build();
		
		return bookingDto1;

	}

}
