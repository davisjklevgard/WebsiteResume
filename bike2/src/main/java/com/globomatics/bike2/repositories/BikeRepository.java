package com.globomatics.bike2.repositories;

import com.globomatics.bike2.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
