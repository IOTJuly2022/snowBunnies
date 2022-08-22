package com.cognizant.snowbunnies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.snowbunnies.models.BillingDetail;

public interface BillingDetailRepository extends JpaRepository<BillingDetail, Long> {

}
