package org.dungha.blooddonateweb.repository;

import org.dungha.blooddonateweb.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Integer>{
}