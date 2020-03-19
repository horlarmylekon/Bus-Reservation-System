package com.intellisense.BusReservationSystem;

import com.intellisense.BusReservationSystem.dto.TripDto;
import com.intellisense.BusReservationSystem.model.Trip;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class BusReservationSystemApplicationTests {

    private static final ModelMapper modelMapper = new ModelMapper();

	@Test
    public void checkTripMapping() {

//        TripDto tripDto = new TripDto();
//        tripDto.setAgencyCode("");
//        tripDto.setBusCode("");
//        tripDto.setDestinationStopCode("");
//        tripDto.setDestinationStopName("");
//        tripDto.setSourceStopCode("");
//        tripDto.setSourceStopName("");
//        tripDto.setFare(500.00);
//
//        //  converting Trip to TripDto object
//        Trip trip = modelMapper.map(tripDto, Trip.class);
//        assertEquals(tripDto.getAgencyCode(), trip.getAgency().getCode());
//        assertEquals(tripDto.getBusCode(), trip.getBus().getCode());
//        assertEquals(tripDto.getDestinationStopCode(), trip.getDestinationStop().getCode());
//        assertEquals(tripDto.getDestinationStopName(), trip.getDestinationStop().getName());
//        assertEquals(tripDto.getSourceStopCode(), trip.getSourceStop().getCode());
//        assertEquals(tripDto.getDestinationStopName(), trip.getSourceStop().getName());
//        assertEquals(tripDto.getFare(), trip.getFare());

    }

}
