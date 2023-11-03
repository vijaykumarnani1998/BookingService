package com.movie.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.booking.dto.BookingDto;
import com.movie.booking.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/create")
	public ResponseEntity<BookingDto> createBooking(@RequestBody BookingDto bookingDto)
	{
		  BookingDto bookingDto1 = bookingService.createBooking(bookingDto);
		  return new ResponseEntity<BookingDto>(bookingDto1,HttpStatus.OK);
	}
	

}
