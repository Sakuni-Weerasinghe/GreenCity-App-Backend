package com.greencity.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greencity.app.entity.CollectionCenter;
import com.greencity.app.entity.PickupRequest;

public interface Customer_RequestRepository extends JpaRepository<PickupRequest, Integer> {

	PickupRequest findByRequestId(int requestId);

	// List<Customer_Request> findByCustomerAndOrderStatus(User user, String
	// requestStatus);
	//
	// List<Customer_Request> findByCollectionCenterUsernameAndOrderStatus(String
	// collectionCenterName, String requestStatus);

	void deleteByRequestId(int requestId);

	List<PickupRequest> findByCollectionCenter(CollectionCenter collectionCenter);
}
