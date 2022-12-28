package com.scm.sringcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.sringcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
