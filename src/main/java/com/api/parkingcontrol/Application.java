package com.api.parkingcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.controllers.ParkingSpotController;
import com.api.parkingcontrol.dtos.ParkingSpotDto;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}
	
	@Autowired
	ParkingSpotController parkingSpotController;
	
	@GetMapping("/")
	public ResponseEntity<Object> index() {
		ParkingSpotDto estacionamento = new ParkingSpotDto();
		estacionamento.setApartment("XS");
		estacionamento.setBlock("X");
		estacionamento.setColorCar("X");
		estacionamento.setBrandCar("X");
		estacionamento.setLicensePlateCar("X");
		estacionamento.setModelCar("X");
		estacionamento.setParkingSpotNumber("X");
		estacionamento.setReponsibleName("X");
		
		
		return parkingSpotController.saveParkingSpot(estacionamento);
		
	}

}
