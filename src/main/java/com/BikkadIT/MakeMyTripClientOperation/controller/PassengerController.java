package com.BikkadIT.MakeMyTripClientOperation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.BikkadIT.MakeMyTripClientOperation.model.Passenger;
import com.BikkadIT.MakeMyTripClientOperation.model.Ticket;

@RestController
public class PassengerController {

	
	@PostMapping(value = "/bookTicket",consumes = "application/json",produces = "application/json")
	public  ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg){
		System.out.println(psg);
		String url="http://localhost:9090/bookTicket";
		
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket>  ticket = rt.postForEntity( url,  psg, Ticket.class);
		
		
		
		return ticket;
		
	}
	
	
	
	
}
