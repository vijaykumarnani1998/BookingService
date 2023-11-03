package com.movie.booking.repo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.movie.booking.entity.BookingEntity;

public interface BookingRepository extends CrudRepository<BookingEntity,UUID> {

}
