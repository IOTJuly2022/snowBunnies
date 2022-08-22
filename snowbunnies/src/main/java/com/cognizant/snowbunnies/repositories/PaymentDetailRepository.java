package com.cognizant.snowbunnies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.snowbunnies.models.PaymentDetail;

public interface PaymentDetailRepository extends  JpaRepository<PaymentDetail, Long>{

}
