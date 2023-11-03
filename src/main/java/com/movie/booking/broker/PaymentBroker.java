package com.movie.booking.broker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="PAYMENT-SERVICE",url="http://localhost:9091/payments")
//@FeignClient(name="PAYMENT-SERVICE")
public interface PaymentBroker {
	
	@GetMapping("/test")
	public String test();
	
	

}
