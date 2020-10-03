package com.flightreservation.flightreservation.services;

import com.flightreservation.flightreservation.domains.Reservation;
import com.flightreservation.flightreservation.dto.ReservationRequest;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reservationRequest);
}
